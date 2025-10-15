import java.util.Scanner;

public class Lanche {

    String nomeDoLanche;
    double precoDeLanche;

    public Lanche(String nome, double preco) {
        this.nomeDoLanche = nome;
        this.precoDeLanche = preco;
    }
    void exibirPreco(){
        System.out.println("O lanche "+nomeDoLanche+" custa R$ " + precoDeLanche);
    }

    public static void main(String[] args) {
        Lanche xtudo = new Lanche("X-Tudo",21.99);
        Lanche xsalada = new Lanche("X-Salada", 15.99);
        Lanche dogNaChapa = new Lanche("Hot-Dog(Chapa)", 15.99);
        Lanche dogNoMolho = new Lanche("Hot-Dog(Molho)", 15.99);
        Lanche dogDuplo = new Lanche("Hot-Dog(Duplo)", 15.99);

        System.out.println("=============Cardápio============");
        System.out.println("1.X-Tudo");
        System.out.println("2.X-Salada");
        System.out.println("3.Hot-Dog (Chapa)");
        System.out.println("4.Hot-Dog (Molho)");
        System.out.println("5.Hot-Dog (Duplo" );
        System.out.println("Digite um valor diferente para sair");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a opção: ");
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println(xtudo.nomeDoLanche);
                System.out.println(xtudo.precoDeLanche);
                break;
            case 2:
                System.out.println(xsalada.nomeDoLanche);
                System.out.println(xsalada.precoDeLanche);
                break;
            case 3:
                System.out.println(dogNaChapa.nomeDoLanche);
                System.out.println(dogNaChapa.precoDeLanche);
                break;
            case 4:
                System.out.println(dogNoMolho.nomeDoLanche);
                System.out.println(dogNoMolho.precoDeLanche);
                break;
            case 5:
                System.out.println(dogDuplo.nomeDoLanche);
                System.out.println(dogDuplo.precoDeLanche);
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}