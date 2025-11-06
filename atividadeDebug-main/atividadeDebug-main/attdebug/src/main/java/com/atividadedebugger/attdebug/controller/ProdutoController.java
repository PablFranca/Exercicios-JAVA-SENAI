package com.atividadedebugger.attdebug.controller;

import com.atividadedebugger.attdebug.model.ProdutoModel;
import com.atividadedebugger.attdebug.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    public ProdutoService produtoService = new ProdutoService();
    
    @GetMapping("/listarTodos")
    public List<ProdutoModel> listarTodos() {
        return produtoService.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ProdutoModel buscarPorId(@PathVariable int id) {
        return produtoService.buscarPorId(id);
    }
    
    //@PostMapping
    //public void adicionarProduto(@RequestBody Produto produto) {
    //    produtoService.adicionarProduto(produto);
    //}
    
    @GetMapping("/total")
    public double calcularTotal() {return produtoService.calcularValorTotal();
    }
}