import java.util.Arrays;

public class Busca {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 9};
        int i = Arrays.binarySearch(numeros,8);
        System.out.println("Valor encontrado na posição" + i);
    }
}
