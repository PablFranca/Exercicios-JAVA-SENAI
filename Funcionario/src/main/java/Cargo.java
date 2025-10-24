public enum Cargo implements Pagamentos{
    HORISTA{
    @Override
    public double calcularPagamento(Funcionario funcionario) {
        if (funcionario instanceof Horista) {
            Horista horista = (Horista) funcionario;
            if(horista.getHorasTrabalhadas() < 160){
                return horista.getValorDaHoraTrabalhada() * horista.getHorasTrabalhadas();
            }else {
                return horista.getValorDaHoraTrabalhada() * horista.getHorasTrabalhadas() * 0.10;
            }

        }
        return 0;
    }

},
    COMISSIONADO{
    @Override
    public double calcularPagamento(Funcionario funcionario){
        if (funcionario instanceof Comissionado){
            Comissionado comissionado = (Comissionado) funcionario;
            return  comissionado.getTotalDeVendas() * comissionado.getTaxaDeComissao();

        }
        return 0;
    }
},
    ASSALARIADO{
        @Override
    public double calcularPagamento(Funcionario funcionario){
            if(funcionario instanceof Assalariado){
                Assalariado assalariado = (Assalariado) funcionario;
                return assalariado.getSalarioBase() + assalariado.getBonusAdicional();
            }
            return 0;
        }
    }
}



