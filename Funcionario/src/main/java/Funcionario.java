public abstract class Funcionario{

    protected final String nome;
    protected static int proximaMatricula = 1;
    protected int matricula;
    protected final Cargo cargo;


    protected double salario;

    protected Funcionario(String nome,
                          Cargo cargo){
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = proximaMatricula;
        matricula++;
    }
    public abstract void mostrarInformacoes();

    public double getSalario() {
        return salario;
    }
}
