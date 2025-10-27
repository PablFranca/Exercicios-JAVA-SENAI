public class Peugeot extends Carro{
    protected Peugeot(String modelo, double quilometragem, double kmPorLitro, double capacidadeDoTanque) {
        super(modelo, quilometragem, kmPorLitro, capacidadeDoTanque);
        if(modelo.equals("203")){

        }

    }
    @Override
    public boolean ligar(){
        if(getModelo().equals("203")){
            System.out.println("Chame um mecânico ou um guincho");
            setEstaLigado(false);
            return false;
        }
    return super.ligar();
    }
}
