package com.ClienteEProduto.ClienteEProduto.produto;

public class Produto {

    protected String nome;
    protected double preco;
    protected String descricao;

    public Produto(String nome, double preco, String descricao){
        this.nome = nome;
        if( preco > 0){
        this.preco = preco;
        }else {
            System.out.println("Valor Inválido");
        }
        this.descricao = descricao;
    }


    public void exibirDetalhes(){

    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "Produto{" +
                "nome='"+ nome + '\''+
                ",preco="+ preco +
                '}';
    }
}
