public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int numeroDePaginas){

    }
    //A estimativa de tempo de leitura de uma página varia entre 1,5 e 2 minutos
    double calcularTempoDeLeitura(){
        return (double) (numeroDePaginas * 2) /60;
        //neste caso multiplicamos o número de páginas por 2 e obtemos um tempo aproximado em minutos, depois dividimos por 60 para entregar o valor em horas.
    }
    void exibirInformacoes(){
        System.out.println("O livro: "+titulo);
        System.out.println(" possui "+ numeroDePaginas+" páginas, ");
        System.out.println("foi publicado ano de "+ anoPublicacao);
        System.out.println("e escrito pelo autor "+ autor);
    }

    String getTitulo(){return titulo;}
    void setTitulo(String titulo){this.titulo = titulo;}

    String getAutor(){return autor;}
    void setAutor(String autor){this.autor = autor;}

    int getNumeroDePaginas(){return numeroDePaginas;}
    void setNumeroDePaginas(int numeroDePaginas){this.numeroDePaginas = numeroDePaginas;}

    int getAnoPublicacao(){return anoPublicacao;}
    void setAnoPublicacao(int anoPublicacao){this.anoPublicacao = anoPublicacao;}
}
