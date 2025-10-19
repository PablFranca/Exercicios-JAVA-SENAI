package Animais;

import GruposDeAnimais.GrupoAnimal;
import GruposDeAnimais.Vertebrados.Mamifero;

public class Cachorro extends Mamifero {
    public Cachorro(String nomePopular, String nomeCientifico, GrupoAnimal grupo, double peso, double altura) {
        super("Cachorro","Canis lupus", 26.0, 49.00 );
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();

    }
    public void emitirSom(){
        super.mostrarInformacoes();
        System.out.println("Woof");
    }
}
