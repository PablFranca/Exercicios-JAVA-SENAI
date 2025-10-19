package GruposDeAnimais.Vertebrados;

import GruposDeAnimais.*;

public class Porifero extends Animal {
    public Porifero(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico,GrupoAnimal.PORIFERO, peso, altura);
    }

    @Override
    public void emitirSom() {

    }
}
