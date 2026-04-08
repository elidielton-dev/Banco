import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // VARIAVEIS
        String name = "admin" ;
        String senha = "123";
        double saldo = 2000 ;

        for (int tentativas = 0; tentativas <= 3; tentativas++) {
            System.out.println("USUARIO:");
            name = sc.next();
            System.out.println("SENHA:");
            senha = sc.next();

            if (!name.equals("admin") || !senha.equals("1234")) {
                System.out.println("USUARIO OU SENHA INCORRETA!");
                System.out.println("TENTE NOVAMENTE");
                System.out.println("TENTATIVA " + tentativas + " DE 3");
                break;

            } else {

                System.out.println("LOGIN BEM SUCEDIDO");
                System.out.println("BEM-VINDO");

            }

            int opcao;
            do {
                System.out.println("OPERAÇÕES");
                System.out.println("DIGITE O NUMERO DA OPERAÇÃO");
                System.out.println("     1 -SALDO");
                System.out.println("   2 - DEPOSITAR");
                System.out.println("    3 - SACAR");
                System.out.println("    4 - SAIR");

               
