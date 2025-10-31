package Produto;

public class ProdutoEletronico extends Produto{

    private int mesesDeGarantia;

    public ProdutoEletronico(String nome, double preco, int mesesDeGarantia) {
        super(nome, preco);
        if (mesesDeGarantia > 0){
        this.mesesDeGarantia = mesesDeGarantia;
        }else {
            System.out.println("Tempo de garantia Inválido");
        }
    }

    @Override
    public void exibirDetalhes() {
        String dadosFormatados = "Nome: " + this.getNome() + "\n" +
                "Preço: " + this.getPreco() + "\n"+
                "Garantia: "+ mesesDeGarantia;
        System.out.println("-------------------------------");
        System.out.println(dadosFormatados);
    }
}
