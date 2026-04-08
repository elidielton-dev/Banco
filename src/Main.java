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
                        System.out.println("SALDO");
                        System.out.println("R$2000,00");
                        System.out.println(saldo);
                        break;

                    case 2:
                        System.out.println("DEPOSITAR");
                        System.out.println("DIGITE O VALOR:");
                        double valorDeposito = sc.nextDouble();
                        System.out.println("VALOR DO DEPOSITADO R$" + valorDeposito);
                        saldo += valorDeposito;
                        System.out.println("VALOR DO DEPOSITADO R$" + valorDeposito + " SALDO ATUAL DE R$" + saldo);
                        break;

                    case 3:
                        for (int saque = 0; saque <= 3; saque++) {
                            System.out.println(" SACAR ");
                            System.out.println("DIGITE UM VALOR:");
                            double valorSaque = sc.nextDouble();
                            double saldoAtual = 2000;
                            saldo -= valorSaque ;

                            if (valorSaque <= 0 || valorSaque > saldoAtual) {
                            if (valorSaque <= 0 || valorSaque > saldo) {
                                System.out.println("IMPOSSIBILITADO DE EXECULTAR");

                            } else {
                                System.out.println("SAQUE");
                                System.out.println("VALOR DO SAQUE R$" + valorSaque);
                                System.out.println("VALOR DO SAQUE R$" + valorSaque + "SALDO ATUAL DE R$" + saldo);
                                break;
                            }

                        }
                        break;

                    case 4:
                        System.out.println("OBRIGADO PELA CONFIANÇÃ");
                        System.out.println("   SAINDO...");


                }

            }
            while (opcao !=4);
            break;
            // OPÇÕES


        }


    }       
