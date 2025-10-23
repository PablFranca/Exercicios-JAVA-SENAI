public class Comissionado extends Funcionario{
    private double salarioBase;
    private double totalDeVendas;

    protected Comissionado(String nome,
                           String matricula,
                           Cargo cargo,
                           double salariobase,
                           double totalDeVendas) {
        super(nome, matricula, cargo);
    }
}
