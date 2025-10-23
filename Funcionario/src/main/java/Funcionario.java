public abstract class Funcionario{
    private String nome;
    private String matricula;
    private Cargo cargo;
    private double salario;

    protected Funcionario(String nome,
                          String matricula,
                          Cargo cargo){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
    }



}
