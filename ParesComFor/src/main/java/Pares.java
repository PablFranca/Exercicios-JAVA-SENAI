public class Pares {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for(int pares : numeros){
            if(pares % 2 == 0){
                System.out.println(pares);
            }
        }
    }
}
