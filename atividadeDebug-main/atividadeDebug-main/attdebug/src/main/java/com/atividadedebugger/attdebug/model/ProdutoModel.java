package com.atividadedebugger.attdebug.model;
import org.springframework.stereotype.Service;

@Service
public class ProdutoModel {
    private int id;
    private String nome;
    private double preco;
    
     public ProdutoModel() {
    }

    public ProdutoModel(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    

    public void setPreco(String preco) {
        this.preco = Double.parseDouble(preco);
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    
}
