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
  menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.println("Saldo Atual:");
                    System.out.println(opcoes.saldo);
                    break;

                case 2:
                System.out.println("Depositar");
                System.out.println("Digita o valor");
                double valorDeposito = sc.nextDouble();
                opcoes.saldo += valorDeposito;
                System.out.println("R$" + valorDeposito + "Depositado com sucesso" + "Seu saldo atual: R$" + opcoes.saldo);
                break;

                case 3:
                    for (int saque = 0; saque <= 3; saque++) {
                        System.out.println("Sacar");
                        System.out.println("Digite o valor");
                        double valorSacar = sc.nextDouble();

                        if (valorSacar <= 0 || valorSacar > opcoes.saldo) {
                            System.out.println("Operação Invalida");

                        } else {
                            opcoes.saldo -= valorSacar;
                            System.out.println("Saque " + valorSacar);
                            System.out.println("Operação realizada com sucesso | Saldo atual: R$" + opcoes.saldo);
                            break;

                        }
                    }
                    break;
                case 4:
                    System.out.println("Obrigado pela confiança");
                    System.out.println("Saindo...");

            }
        }
        while (menu !=4);

}
               
