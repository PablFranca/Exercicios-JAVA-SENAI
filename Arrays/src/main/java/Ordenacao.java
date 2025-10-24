import java.util.Arrays;

public class Ordenacao {
    public static void main(String[] args) {
        int[] numeros = {5,2,8,1,9};
        System.out.println("Desordenados: ");
        for(int num : numeros){
            System.out.println(num);
        }
        Arrays.sort(numeros);
        System.out.println("Ordenados: ");

        System.out.println(Arrays.toString(numeros));

    }
}
