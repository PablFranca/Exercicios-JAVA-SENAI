import java.util.Scanner;

public class Mario {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um tamanho entre 0 e 10 para a torre: ");
        int tamanhoTorre;
        do{
            tamanhoTorre = sc.nextInt();
        }while (tamanhoTorre < 0 || tamanhoTorre > 10);


        for(int i = 0 ; i < tamanhoTorre; i++){
           for(int j = tamanhoTorre -1; j >= i ; j--){
               System.out.print(" ");
           }
            System.out.println("#");
        }
        sc.close();
    }

}
