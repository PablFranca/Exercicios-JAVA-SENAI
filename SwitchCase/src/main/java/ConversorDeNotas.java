import java.util.Scanner;

public class ConversorDeNotas {
    public ConversorDeNotas(int nota){
        converterNotas(nota);
    }

    String letraCorrespondente;

    void converterNotas(int nota){
        switch (nota){
            case 1:
            case 2:
                letraCorrespondente="Avaliação E - Reprovado";
                break;
            case 3:
            case 4:
                letraCorrespondente = "Avaliação D - Insuficiente";
                break;
            case 5:
            case 6:
                letraCorrespondente ="Avaliação C - Regular";
                break;
            case 7:
            case 8:
                letraCorrespondente="Avaliação B - Bom";
                break;
            case 9:
            case 10:
                letraCorrespondente="Avaliação A - Excelente";
                break;
            default:
                System.out.println("Valor invalido!");
        }
        System.out.println(letraCorrespondente);
    }
    public static void main(String[] args) {
    Scanner entradaDeNota = new Scanner(System.in);
    new ConversorDeNotas(10);
    entradaDeNota.close();
    }

}
