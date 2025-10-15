public class Produto {
    static int contador = 0;

    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
        contador++;
    }
    void exibir(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: "+ preco);
    }
    void mostrarTotal(){
        System.out.println("Você tem "+ contador + " produtos cadastrados.");
    }

    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz Tio Jorge", 29.90);
        Produto feijao = new Produto("Feijão Kicaldo",8.99);
        arroz.mostrarTotal();
    }
}
