package GruposDeAnimais.Invertebrados;

import GruposDeAnimais.*;

public class Anelideo extends Animal {
    public Anelideo(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.ANELIDEO, peso, altura);
    }

    @Override
    public void emitirSom() {

    }
}
