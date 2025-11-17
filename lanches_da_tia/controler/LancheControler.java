package com.springapp.lanches_da_tia.controler;

import com.springapp.lanches_da_tia.model.Lanche;
import com.springapp.lanches_da_tia.model.TipoDeLanche;
import com.springapp.lanches_da_tia.services.LancheServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lanches")
public class LancheControler {
    @Autowired
    private LancheServices lancheServices;

    @GetMapping
    public ResponseEntity<List<Lanche>> listarTodosOsLanches() {
        List<Lanche> lanches = lancheServices.listarLanches();
        return ResponseEntity.ok(lanches);

    }

    @GetMapping("/{id}")
    public ResponseEntity<Lanche> buscarPorId(@PathVariable Integer id) {
        Lanche lanche = lancheServices.buscarPorId(id);
        if (lanche != null) {
            return ResponseEntity.ok(lanche);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity <List<Lanche>> adicionarLanche(@RequestBody List<Lanche> lanches) {
        List<Lanche> lanchesSalvos = lancheServices.adicionarLanches(lanches);
        return ResponseEntity.status(HttpStatus.CREATED).body(lanchesSalvos);
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<Lanche>> buscarPorCategoria(@PathVariable TipoDeLanche categoria) {
        List<Lanche> lanchesFiltradosPorCategoria = lancheServices.buscarPorCategoria(categoria);
        if (!lanchesFiltradosPorCategoria.isEmpty()) {
            return ResponseEntity.ok(lanchesFiltradosPorCategoria);
        } else return ResponseEntity.notFound().build();
    }
    @GetMapping("/disponivel/{disponivel}")
    public ResponseEntity<List<Lanche>> buscarPorDisponibilidade(@PathVariable boolean disponivel){
        List<Lanche> lanchesDisponiveisOuIndisponiveis = lancheServices.buscarPorAtividade(disponivel);
        if(disponivel){
            return ResponseEntity.ok(lanchesDisponiveisOuIndisponiveis);
        }else {
            return ResponseEntity.ok(lanchesDisponiveisOuIndisponiveis);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable int id) {
        lancheServices.deletarLanche(id);
        return ResponseEntity.noContent().build();
    }
}