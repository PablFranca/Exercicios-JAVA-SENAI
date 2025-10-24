public class Comissionado extends Funcionario{

    private final double taxaDeComissao;
    private final double totalDeVendas;

    protected Comissionado(String nome,
                           double taxaDeComissao,
                           double totalDeVendas) {
        super(nome, Cargo.COMISSIONADO);
        this.taxaDeComissao = taxaDeComissao;
        this.totalDeVendas = totalDeVendas;
    }


    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }


    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("O funcionario "+ nome+",");
        System.out.println("matrícula " + matricula + ",");
        System.out.println("no regime + " + cargo.toString().toLowerCase()+",");
        System.out.println("tendo um total de vendas de" + totalDeVendas+",");
        System.out.println("sua taxa de comissão é de " + taxaDeComissao+",");
        System.out.println("e recebe no total" + getSalario());

    }
}
