public class Ex05 {

    static final double PI = 3.14;
    double resultado;
    public Ex05(double raio){
        resultado = PI * raio * raio;
    }

    public static void main(String[] args) {
        Ex05 ex = new Ex05(6);
        System.out.println(ex.resultado);
    }

}
