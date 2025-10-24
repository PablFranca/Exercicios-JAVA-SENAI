import java.util.Arrays;

public class Copia {
    public static void main(String[] args) {
        int[] original = {3, 6, 9, 12, 15};
        int[] copia = Arrays.copyOf(original ,original.length);
        int[] copiaSelecionada = Arrays.copyOfRange(original,1, 3);

        System.out.println("Original: "+ Arrays.toString(original));
        System.out.println("Copia: " +Arrays.toString(copia));
        System.out.println("Copia seletiva(1-3): "+Arrays.toString(copiaSelecionada));
    }
}
