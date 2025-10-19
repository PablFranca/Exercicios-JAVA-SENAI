package GruposDeAnimais.Vertebrados;

import GruposDeAnimais.*;

public class Mamifero extends Animal {
    public Mamifero(String nomePopular, String nomeCientifico, double peso, double altura){
        super(nomePopular,nomeCientifico,GrupoAnimal.MAMIFERO,peso,altura );
    }

    @Override
    public void emitirSom() {

    }
}
