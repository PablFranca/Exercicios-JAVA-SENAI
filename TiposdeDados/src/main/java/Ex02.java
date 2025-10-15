public class Ex02 {
    public static void main(String[] args) {
        //📝 Exercício 2: Escopo de Variáveis
        //Identifique e corrija o erro no código abaixo relacionado ao escopo de variáveis.
        //
        //java
        //public void calcular() {
        //    if (true) {
        //        int resultado = 100;
        //    }
        //    System.out.println(resultado); // Erro aqui
        //}
        calcular();
    }
    public static void calcular(){
        if (true){
            int resultado = 100;
            System.out.println(resultado);
        }
    }

}

