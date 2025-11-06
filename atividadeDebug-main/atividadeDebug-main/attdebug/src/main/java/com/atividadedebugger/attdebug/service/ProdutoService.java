package com.atividadedebugger.attdebug.service;



import com.atividadedebugger.attdebug.model.ProdutoModel;
import java.util.ArrayList;
import java.util.List;


public class ProdutoService {
    
    private final List<ProdutoModel> produtoModels = new ArrayList<>();

    public ProdutoService() {
        produtoModels.add(new ProdutoModel(1, "Notebook", 2500.00));
        produtoModels.add(new ProdutoModel(2, "Mouse", 50.00));
    }
    
    public List<ProdutoModel> listarTodos() {
        return produtoModels;
    }
    
    public ProdutoModel buscarPorId(int id) {
        for (ProdutoModel p : produtoModels) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    public void adicionarProduto(ProdutoModel produtoModel) {
        produtoModels.add(produtoModel);
    }
    
    public double calcularValorTotal() {
        double total = 0;
        for (ProdutoModel p : produtoModels) {
            total += p.getPreco();
        }
        return total;
    }
}