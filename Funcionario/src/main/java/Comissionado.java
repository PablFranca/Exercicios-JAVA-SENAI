public class Comissionado extends Funcionario{

    private double taxaDeComissao;
    private double totalDeVendas;

    protected Comissionado(String nome,
                           String matricula,
                           Cargo cargo,
                           double taxaDeComissao,
                           double totalDeVendas) {
        super(nome, matricula, Cargo.COMISSIONADO);
        this.taxaDeComissao = taxaDeComissao;
        this.totalDeVendas = totalDeVendas;
    }


    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }

    public void setTaxaDeComissao(double salarioBase) {
        this.taxaDeComissao = salarioBase;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }
}
