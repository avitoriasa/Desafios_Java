import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        double saldo = 900.00;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da sua conta");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o número da sua agência");
        String agencia = sc.nextLine();

        System.out.println("Qual seu nome?");
        String nomeCliente = sc.nextLine();

        sc.close();

        System.out.println("Olá" + nomeCliente + "seu saldo é " + saldo);
        System.out.println(agencia);
        System.out.println(numeroConta);

    }
}
