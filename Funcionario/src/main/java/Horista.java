public class Horista extends Funcionario {
    private final double valorDaHoraTrabalhada;
    private final double horasTrabalhadas;

    protected Horista(String nome,
                      double valorDaHoraTrabalhada,
                      double horasTrabalhadas) {
        super(nome, Cargo.HORISTA);
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.horasTrabalhadas = horasTrabalhadas;
    }



    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorDaHoraTrabalhada() {
        return valorDaHoraTrabalhada;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("O funcionario "+ nome+",");
        System.out.println("matrícula " + matricula + ",");
        System.out.println("no regime + " + cargo.toString().toLowerCase()+",");
        System.out.println("tendo sua hora negociada em " +valorDaHoraTrabalhada +",");
        System.out.println("trabalhou por" + horasTrabalhadas + " horas,");
        System.out.println("e recebe no total" + getSalario());
    }
}
