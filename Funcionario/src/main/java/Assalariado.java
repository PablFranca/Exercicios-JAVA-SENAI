public class Assalariado extends Funcionario{

    private double salarioBase;
    private double bonusAdicional;

    protected Assalariado(String nome, String matricula, Cargo cargo, double salarioBase, double bonusAdicional ) {
        super(nome, matricula, Cargo.ASSALARIADO);
        this.salarioBase = salarioBase;
        this.bonusAdicional = bonusAdicional;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBonusAdicional() {
        return bonusAdicional;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setBonusAdicional(double bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }
}
