public class Fiat extends Carro {
    protected Fiat(String modelo, double quilometragem, double kmPorLitro, double capacidadeDoTanque) {
        super(modelo, quilometragem, kmPorLitro, capacidadeDoTanque);
    }

    @Override
    public boolean ligar(){
        if(getModelo().equals("Marea")){
            System.out.println("Tira esse carro daqui pois pode pegar fogo");
            setEstaLigado(false);
        return false;
    }
        return super.ligar();
    }
}
