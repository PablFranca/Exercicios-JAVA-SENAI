public enum Cargo implements Pagamentos{
    HORISTA{
    @Override
    public double calcularPagamento(double horasTrabalhadas, double valorDaHora){
        return horasTrabalhadas * valorDaHora;
        }
    },
    COMISSIONADO{
    @Override
    public double calcularPagamento(double totalDeVendas, double taxaDeComissao){
        return totalDeVendas * taxaDeComissao;
        }
    },
    ASSALARIADO{
        @Override
    public double calcularPagamento(double salarioFixo, double bonusFixo){
            return salarioFixo + bonusFixo;
        }
    };

    private double valorSalarioTotal;



}



