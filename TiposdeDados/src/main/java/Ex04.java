public class Ex04 {
    int somar() {
        int soma=0;
        for (int i = 0; i < 10; i++) {
            soma+=i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Ex04 ex = new Ex04();
        System.out.println(ex.somar());
    }
}
