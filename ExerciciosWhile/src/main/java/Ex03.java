import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        //Exercício 3: Tabuada com WHILE
        //Peça um número ao usuário e mostre sua tabuada (de 1 a 10) usando WHILE.
        System.out.println();
        System.out.println("Exercício 03");
        Scanner sc01 = new Scanner(System.in);
        int tabuada;
        int resultado=0;
        do{
            System.out.println("Digite o numero da tabuada que deseja de 1 a 10");
            tabuada = sc01.nextInt();
        }while(tabuada <0 && tabuada>=10 );
        for(int l = 0; l < 10; l++){
            resultado *= l;
            System.out.println( l + " x " + tabuada +" = " + resultado);
        }
        sc01.close();
    }
}
