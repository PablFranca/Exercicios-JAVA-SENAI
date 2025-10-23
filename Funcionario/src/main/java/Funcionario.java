public abstract class Funcionario{
    protected String nome;
    protected String matricula;
    protected Cargo cargo;
    protected double salario;

    protected Funcionario(String nome,
                          String matricula,
                          Cargo cargo){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }



}
