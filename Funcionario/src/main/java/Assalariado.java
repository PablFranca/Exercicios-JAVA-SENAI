public class Assalariado extends Funcionario{
    private double salarioBase;
    private double bonusAdicional;
    protected Assalariado(String nome, String matricula, Cargo cargo, double salarioBase, double bonusAdicional ) {
        super(nome, matricula, cargo);
        this.salarioBase = salarioBase;
        this.bonusAdicional = bonusAdicional;
    }
}
