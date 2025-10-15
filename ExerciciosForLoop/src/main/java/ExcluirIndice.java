import java.util.Scanner;

public class ExcluirIndice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o referencial X:");
        int valorXAExcluir = sc.nextInt();
        System.out.println("Digite o referencial Y:");
        int valorYAExcluir = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 11; i++){
            for (int j = 1; j <= 11; j++){
                if(i == valorXAExcluir && j == valorYAExcluir){
                    System.out.print("   ");
                }else{
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }
    }
}
