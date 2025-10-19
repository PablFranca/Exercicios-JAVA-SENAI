import GruposDeAnimais.Animal;
import GruposDeAnimais.GrupoAnimal;
import GruposDeAnimais.Invertebrados.*;
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
            System.out.println("4. Emitir Som");
            System.out.println("5. Sair ");
            System.out.println("Escolher opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Informe os dados do animal: ");
                    System.out.print("Nome Popular: ");
                    String nomePopular = sc.nextLine();

                    System.out.print("Nome Científico: ");
                    String nomeCientifico = sc.nextLine();

                    System.out.print("Grupo: ");
                    GrupoAnimal grupoAnimal = GrupoAnimal.valueOf(sc.nextLine().toUpperCase());

                    System.out.print("Altura média: ");
                    double alturaMedia = sc.nextDouble();

                    System.out.print("Peso médio: ");
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
                            System.out.println("Grupo animal inválido. Animal não cadastrado!");
                            break;
                    }
                    if (animal !=null){
                        animais.add(animal);
                        System.out.println("Animal " + animal.getNomePopular()+" cadastrado com sucesso!");
                    }
                        break;


                case 2:
                    System.out.println("Animais cadastrados========");
                    if (animais.isEmpty()){
                        System.out.println("Nenhum animal cadastrado");
                    }
                    for(Animal a: animais){
                        System.out.println(" - "+ a.getNomePopular());
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do animal que deseja procurar ");
                    String nomePesquisado = sc.nextLine();
                    Animal animalEncontrado = null;
                    for (Animal a: animais){
                        if(a.getNomePopular().equalsIgnoreCase(nomePesquisado)){
                            animalEncontrado = a;
                            break;
                        }
                    }
                    if (animalEncontrado != null){
                        animalEncontrado.mostrarInformacoes();
                    }else {
                        System.out.println("Animal não encontrado na lista");
                    }
                    break;
                case 4:
                    System.out.println("Digite o animal que deve emitir um som");
                    String nomeAnimalQueEmiteSom = sc.nextLine();
                    Animal animalComSomEncontrado = null;

                    for (Animal a: animais){
                        if(a.getNomePopular().equalsIgnoreCase(nomeAnimalQueEmiteSom)){
                            animalComSomEncontrado = a;
                            break;
                        }
                    }if (animalComSomEncontrado!= null){
                        animalComSomEncontrado.emitirSom();
                    }else {
                    System.out.println("Animal não encontrado na lista!");
                    }
                    break;
                case 5:
                    System.out.println("Você escolheu sair!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }


        }while (opcao!= 5);
        sc.close();
    }
}
