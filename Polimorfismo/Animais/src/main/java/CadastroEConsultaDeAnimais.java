import GruposDeAnimais.Animal;
import GruposDeAnimais.GrupoAnimal;
import GruposDeAnimais.Invertebrados.Anelideo;
import GruposDeAnimais.Invertebrados.Artropode;
import GruposDeAnimais.Invertebrados.Cnidario;
import GruposDeAnimais.Invertebrados.Equinodermo;
import GruposDeAnimais.Vertebrados.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroEConsultaDeAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();
        int opcao;
        do {
            System.out.println("Programa para cadastro e consulta de animais ");
            System.out.println("1. Cadastrar Animal.");
            System.out.println("2. Mostrar Animais cadastrados ");
            System.out.println("3. Mostrar informações do animal ");
            System.out.println("4. Apagar animal ");
            System.out.println("5. Emitir Som");
            System.out.println("6. Sair ");
            System.out.println("Escolher opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe os dados do animal: ");
                    System.out.println("Nome Popular: ");
                    String nomePopular = sc.nextLine();

                    System.out.println("Nome Científico: ");
                    String nomeCientifico = sc.nextLine();

                    System.out.println("Grupo: ");
                    GrupoAnimal grupoAnimal = GrupoAnimal.valueOf(sc.nextLine().toUpperCase());

                    System.out.println("Altura média: ");
                    double alturaMedia = sc.nextDouble();

                    System.out.println("Altura média: ");
                    double pesoMedio = sc.nextDouble();

                    sc.nextLine();

                    Animal animal = null;

                    switch (grupoAnimal){
                        case ANELIDEO:
                            animal = new Anelideo(nomePopular,nomeCientifico,pesoMedio, alturaMedia);
                            break;
                        case ARTROPODE:
                            animal = new Artropode(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case CNIDARIO:
                            animal = new Cnidario(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case EQUINODERMO:
                            animal = new Equinodermo(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case ANFIBIO:
                            animal = new Anfibio(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case AVE:
                            animal = new Ave(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case MAMIFERO:
                            animal = new Mamifero(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case PEIXE:
                            animal = new Peixe(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case PORIFERO:
                            animal = new Porifero(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        case REPTIL:
                            animal = new Reptil(nomePopular, nomeCientifico, pesoMedio, alturaMedia);
                            break;
                        default:
                            System.out.println("Grupo animal inválido");
                            break;
                    }
                    boolean animalAdicionado = animais.add(animal);



            }


        }while (opcao!= 6);
    }
}
