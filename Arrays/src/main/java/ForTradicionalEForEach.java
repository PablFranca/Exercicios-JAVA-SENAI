import java.util.Arrays;

public class ForTradicionalEForEach {
    public static void main(String[] args) {
        int[] pares = {2, 4, 6, 8, 10};
        System.out.println("For tradicional: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
        System.out.println("For each, ou for incrementado");
        for (int par : pares) {
            System.out.println(par);
        }
    }
}