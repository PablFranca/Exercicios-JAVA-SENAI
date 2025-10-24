import java.util.Arrays;

public class Preenchimento {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Arrays.fill(arr,10);
        System.out.println("Array preenchido " + Arrays.toString(arr));
    }
}
