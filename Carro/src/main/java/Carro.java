public abstract class Carro {
    private final String modelo;
    private double quilometragem;
    private final double kmPorLitro;
    private final double capacidadeDoTanque;
    private double combustivelNoTanque;
    private final double  precoDoLitroDaGasolina;

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public double getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public double getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(double combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public double getPrecoDoLitroDaGasolina() {
        return precoDoLitroDaGasolina;
    }

    private boolean estaLigado;

    protected Carro(String modelo, double quilometragem, double kmPorLitro, double capacidadeDoTanque){
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.kmPorLitro = kmPorLitro;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.estaLigado = false;
        this.precoDoLitroDaGasolina = 6.05;
        this.combustivelNoTanque = capacidadeDoTanque;
    }
    public boolean ligar(){
        if(estaLigado){
            System.out.println(modelo + " já está ligado!");
        }else{
        System.out.println("O veículo está ligado");
        return estaLigado = true;
        }
        return this.estaLigado;
    }
    public boolean desligar(){
        if(!estaLigado){
            System.out.println("O veículo já está desligado");
        }else{
        System.out.println("O veículo está desligado");
        return estaLigado = false;
        }
        return false;
    }
    public boolean percorrerDistancia(double distanciaEmKm){
        if(!estaLigado){
            System.out.println("Para percorrer uma distancia, favor ligar o " + modelo);
            return false;
        }
        double combustivelNecessario = distanciaEmKm / kmPorLitro;

        if (combustivelNoTanque>= combustivelNecessario){
            this.quilometragem += distanciaEmKm;
            this.combustivelNoTanque-=combustivelNecessario;
            System.out.println(modelo+" percorreu "+distanciaEmKm+" km.");
            return true;
        }else{
            System.out.println("Combustivel insuficiente para percorrer "+distanciaEmKm);
            return false;
        }
    }

    public double calcularCustoDaViagem(double distanciaEmKm){
       double litrosNecessarios = distanciaEmKm/kmPorLitro;
       return  litrosNecessarios *precoDoLitroDaGasolina;

    }
    public int calcularQuantidadeMinimaDeParadas(double distanciaPercorridaEmKm){
        double autonomiaTotal = kmPorLitro * capacidadeDoTanque;
        if (autonomiaTotal<=0){
            return Integer.MAX_VALUE;
        }
        double tanquesNecessarios = Math.ceil(distanciaPercorridaEmKm/autonomiaTotal);
        int paradas = (int) tanquesNecessarios-1;

        return Math.max(0,paradas);
    }
    public void abastecer(double litros){
        this.combustivelNoTanque+=litros;
        if (this.combustivelNoTanque>this.capacidadeDoTanque){
            this.combustivelNoTanque = capacidadeDoTanque;
            System.out.println("Tanque cheio. O excesso foi ignorado. ");
        }else {
            System.out.println("Abastecido com "+litros+" litros.");
        }
    }
    public void exibirInformacoes(){
        System.out.println("----------Informações do veículo----------");
        System.out.println("O carro de modelo :"+ modelo);
        System.out.println("Atualmente tem " + quilometragem + " Kms rodados");
        System.out.println("Combustível no Tanque: " + String.format("%.2f", combustivelNoTanque) + " L");
        System.out.println("Estado: " + (estaLigado ? "Ligado" : "Desligado"));
    }
    public String getModelo() {
        return modelo;
    }
    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }
}
