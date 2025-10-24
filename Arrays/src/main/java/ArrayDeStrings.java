public class ArrayDeStrings {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos"};
        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Ultimo nome: " + nomes[2]);
        for(String nome : nomes){
            System.out.println(nome);
        }
    }

}
