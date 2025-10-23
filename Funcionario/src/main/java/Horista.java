public class Horista extends Funcionario{
    private double valorDaHoraTrabalhada;
    private double horasTrabalhadas;

    protected Horista(String nome,
                      String matricula,
                      Cargo cargo,
                      double valorDaHoraTrabalhada,
                      double horasTrabalhadas) {
        super(nome, matricula, cargo);
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
