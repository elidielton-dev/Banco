import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // LOGIN
        String name = "admin";
        String senha = "1234";

        for (int tentativas = 0; tentativas <= 4; tentativas++) {
            System.out.println("USUARIO:");
            name = sc.next();
            System.out.println("SENHA:");
            senha = sc.next();

            if (!name.equals("admin") || !senha.equals("1234")) {
                System.out.println("USUARIO OU SENHA INCORRETA!");
                System.out.println("TENTE NOVAMENTE");
                System.out.println("TENTATIVA " + tentativas + " DE 3");

            } else {

                System.out.println("LOGIN BEM SUCEDIDO");
                System.out.println("BEM-VINDO");
                break;
            }

            int opcao;
            do {
                System.out.println("OPERAÇÕES");
                System.out.println("DIGITE O NUMERO DA OPERAÇÃO");
                System.out.println("     1 -SALDO");
                System.out.println("   2 - DEPOSITAR");
                System.out.println("    3 - SACAR");
                System.out.println("    4 - SAIR");

                opcao = sc.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println("SALDO");
                        System.out.println("R$2000,00");
                        break;

                    case 2:
                        System.out.println("DEPOSITAR");
                        System.out.println("DIGITE O VALOR:");
                        double valorDeposito = sc.nextDouble();
                        System.out.println("VALOR DO DEPOSITADO R$" + valorDeposito);
                        break;



                }

            }
            while (opcao !=4);
            // OPÇÕES


        }


    }
}