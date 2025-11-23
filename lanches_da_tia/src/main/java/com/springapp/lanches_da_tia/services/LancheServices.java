package com.springapp.lanches_da_tia.services;

import com.springapp.lanches_da_tia.model.Lanche;
import com.springapp.lanches_da_tia.model.TipoDeLanche;
import com.springapp.lanches_da_tia.repository.LancheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LancheServices {
    @Autowired
    private LancheRepository lancheRepository;

    public List<Lanche> listarLanches(){return lancheRepository.findByDisponivel(true);}

    public List<Lanche> buscarPorCategoria(TipoDeLanche tipoDeLanche){
        return lancheRepository.findByTipoDeLancheAndDisponivel(tipoDeLanche,true);
    }
    public Lanche buscarPorId(@PathVariable Integer id) {
        return lancheRepository.findById(id).orElse(null);
    }
    public List<Lanche> buscarPorAtividade(@PathVariable boolean disponivel){
        return lancheRepository.findByDisponivel(disponivel);
    }
    public List<Lanche> adicionarLanches (List<Lanche> lanches){
        lanches.forEach(lanche -> lanche.setDisponivel(true));

        for(Lanche lanche: lanches) {
            int tempo = lanche.getTempoDePreparoEmMinutos();
            TipoDeLanche tipoDeLanche = lanche.getTipoDeLanche();
            if (tempo <= 0) {
                throw new IllegalArgumentException("O tempo deve ser maior que zero");
            }

            switch (tipoDeLanche) {
                case LANCHES -> {
                    if (tempo > 15) {
                        throw new IllegalArgumentException("O tempo de preparo de " + tipoDeLanche + " deve ser de no máximo 15 minutos");
                    }
                    break;
                }
                case BEBIDAS, SOBREMESAS -> {
                    if (tempo > 5) {
                        throw new IllegalArgumentException("O tempo de preparo de" + tipoDeLanche + " deve ser de no máximo 5 minutos");
                    }
                    break;
                }
                case ACOMPANHAMENTOS -> {
                    if (tempo > 10) {
                        throw new IllegalArgumentException("O tempo de preparo de" + tipoDeLanche + " deve ser de no máximo 10 minutos");
                    }
                    break;
                }
            }

        }
        return lancheRepository.saveAll(lanches);
    }
    public void deletarLanche(int id){
        lancheRepository.deleteById(id);
    }

}

