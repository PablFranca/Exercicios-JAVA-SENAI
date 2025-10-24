public class Assalariado extends Funcionario{

    private final double salarioBase;
    private final double bonusAdicional;

    protected Assalariado(String nome, double salarioBase, double bonusAdicional ) {
        super(nome, Cargo.ASSALARIADO);
        this.salarioBase = salarioBase;
        this.bonusAdicional = bonusAdicional;
    }
    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBonusAdicional() {
        return bonusAdicional;
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("O funcionario "+ nome);
        System.out.println("matrícula " + matricula);
        System.out.println("recebe " + getSalario());
        System.out.println("no regime + " + cargo.toString().toLowerCase());
        System.out.println("sendo o salário base" + salarioBase);
        System.out.println("e bonus de " + bonusAdicional);
    }
}
