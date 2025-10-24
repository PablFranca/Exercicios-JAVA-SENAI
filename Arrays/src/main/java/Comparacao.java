import java.util.Arrays;

public class Comparacao {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        boolean comparacao = Arrays.equals(a,b);
        System.out.println("Arrays iguais: " + comparacao);
        b[0] = 4;
        comparacao = Arrays.equals(a,b);
        System.out.println("Arrays iguais: " + comparacao);
    }
}
