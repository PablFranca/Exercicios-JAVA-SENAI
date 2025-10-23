public class Horista extends Funcionario {
    private double valorDaHoraTrabalhada;
    private double horasTrabalhadas;

    protected Horista(String nome,
                      String matricula,
                      Cargo cargo,
                      double valorDaHoraTrabalhada,
                      double horasTrabalhadas) {
        super(nome, matricula, Cargo.HORISTA);
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.horasTrabalhadas = horasTrabalhadas;
    }



    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }

    public void setValorDaHoraTrabalhada(double valorDaHoraTrabalhada) {
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }
}
