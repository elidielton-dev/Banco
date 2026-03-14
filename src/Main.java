import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BEM VINDO AO DELPAY ===");
        System.out.println("    SELECIONE UMA OPÇÃO");
        System.out.println("    1 - SACAR");
        System.out.println("    2 - DEPOSITAR");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("SACAR");
                break;
            case 2:
                System.out.println("DEPOSITAR");
                break;

            default:
                System.out.println("OPÇÂO INVALIDA");

        }

        sc.close();

    }
}