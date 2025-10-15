import java.util.Scanner;

public class MenuParaLanches {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU: ");
        System.out.println("1- DOG SIMPLES NA CHAPA ");
        System.out.println("2- DOG DUPLO NA CHAPA ");
        System.out.println("3- DOG SIMPLES NO MOLHO ");
        System.out.println("4- DOG DUPLO NO MOLHO");
        System.out.println("5- X-TUDO");
        System.out.println("6- X-SALADA");
        final double
        final double PRECO_LANCHE


        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("VALOR DOG SIMPLES NA CHAPA "+);
                break;
            case 2:
                System.out.println("VALOR DOG DUPLO NA CHAPA "+);
                break;
            case 3:
                System.out.println("VALOR: DOG SIMPLES NO MOLHO "+);
                break;
            case 4:
                System.out.println("VALOR: DOG DUPLO NO MOLHO "+);
                break;
            case 5:
                System.out.println("VALOR: X-SALADA "+);
                break;
            case 6:
                System.out.println("VALOR: X-TUDO "+);
                break;
            default:
                System.out.println("Ainda não possuímos esse lanche");
        }
    }
}
