import java.util.Arrays;
import java.util.Scanner;

public class GradeDeHashesEExclusaoDeValor {
    public static void main(String[] args) {
        String[][] quadro = new String[5][5];
        for (String[] hashes : quadro) {
            Arrays.fill(hashes, "#");
        }
        GradeDeHashesEExclusaoDeValor gerador = new GradeDeHashesEExclusaoDeValor();
        gerador.imprimirValores(quadro);


        int x, y;
        System.out.println("Escolha índice entre 0 e 4 pra excluir: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Eixo Vertical: ");
        x = sc.nextInt();
        if(x < 0|| x>= quadro.length){
            throw new IllegalArgumentException("Valor inválido");
        }
        System.out.println("Eixo Horizontal: ");
        y = sc.nextInt();
        if(y < 0|| y>= quadro[0].length){
            throw new IllegalArgumentException("Valor inválido");
        }

        quadro[x][y] = " ";
        gerador.imprimirValores(quadro);
    }

    void imprimirValores(String[][] caracteres) {
        for (String[] caracter : caracteres) {
            for (String s : caracter) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
