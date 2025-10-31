package Produto;

public abstract class Produto {

    protected String nome;
    protected double preco;

    protected Produto(String nome, double preco){
        this.nome = nome;
        if( preco > 0){
        this.preco = preco;
        }else {
            System.out.println("Valor Inválido");
        }
    }


    public abstract void exibirDetalhes();


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }
}
