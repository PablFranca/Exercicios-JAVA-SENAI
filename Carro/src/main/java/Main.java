public class Main {
    public static void main(String[] args) {
        Peugeot peugeot208 = new Peugeot("208",200000.00,13.6,47.0);
        peugeot208.ligar();
        peugeot208.percorrerDistancia(100.00);
        peugeot208.exibirInformacoes();
        double custoDeGasolina = peugeot208.calcularCustoDaViagem(2000);
        System.out.printf("O custo da gasolina para percorrer essa distancia é R$ %.2f" , custoDeGasolina);
    }

}
