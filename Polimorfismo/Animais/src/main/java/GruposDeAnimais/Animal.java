package GruposDeAnimais;

public abstract class Animal {
    private String nomePopular;
    private String nomeCientifico;
    private GrupoAnimal grupo;
    private double pesoMedio;
    private double alturaMedia;
    private String somDoAnimal;

    public Animal(String nomePopular, String nomeCientifico, GrupoAnimal grupo, double peso, double altura, String somDoAnimal){
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.grupo = grupo;
        this.pesoMedio = peso;
        this.alturaMedia = altura;
        this.somDoAnimal = somDoAnimal;
    }
    public String emitirSom(){
        return this.somDoAnimal;
    }

    public void mostrarInformacoes(){
        System.out.println("O animal de nome popular " + nomePopular);
        System.out.println("Possui nome cientifico " + nomeCientifico );
        System.out.println("e é um " + Familia.valueOf(grupo.toString()));
        System.out.println(" da familia dos " + grupo.toString().toLowerCase());
        System.out.println("seu tamanho médio é "+ alturaMedia);
        System.out.println("e a sua altura média é "+pesoMedio);
        System.out.println(" O som que ele faz é "+ somDoAnimal);
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public GrupoAnimal getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoAnimal grupo) {
        this.grupo = grupo;
    }

    public double getPeso() {
        return pesoMedio;
    }

    public void setPeso(double peso) {
        this.pesoMedio = peso;
    }

    public double getAltura() {
        return alturaMedia;
    }

    public void setAltura(double altura) {
        this.alturaMedia = altura;
    }
}

