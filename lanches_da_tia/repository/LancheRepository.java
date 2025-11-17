package com.springapp.lanches_da_tia.repository;

import com.springapp.lanches_da_tia.model.Lanche;
import com.springapp.lanches_da_tia.model.TipoDeLanche;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LancheRepository extends JpaRepository<Lanche, Integer> {
    List<Lanche> findByTipoDeLancheAndDisponivel(TipoDeLanche tipoDeLanche, boolean disponivel);
    List<Lanche> findByDisponivel(boolean disponivel);
}
