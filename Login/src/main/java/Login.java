import java.util.Scanner;
public class Login {
    private String nomeDeUsuario;
    private String senhaDeUsuario;

    void definirDadosDeLogin(Scanner sc){
        System.out.println("Defina um nome de usuário: ");
        String nomeRecebido = sc.nextLine();

        System.out.println("Defina uma senha de usuário");
        String senhaRecebida = sc.nextLine();

        this.nomeDeUsuario = nomeRecebido;
        this.senhaDeUsuario = senhaRecebida;
    }

    void validarDadosDeLogin(Scanner sc){

        System.out.println("--------------LOGIN-------------------");

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Senha: ");
        String senha = sc.nextLine();


        if(nome.equals(this.nomeDeUsuario)&& senha.equals((this.senhaDeUsuario))){
            System.out.println("Login válido, bem vindo ao sistema");
        }else{
            System.out.println("Login inválido, tente novamente!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Login login = new Login();

        login.definirDadosDeLogin(sc);
        login.validarDadosDeLogin(sc);

        sc.close();
    }
}



