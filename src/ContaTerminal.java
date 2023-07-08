import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        String primeiroNome;
        String segundoNome;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        System.out.println("Por favor, digite seu nome!");
        primeiroNome = scanner.next();
        segundoNome = scanner.next();
        nomeCliente = primeiroNome + " " + segundoNome;
        System.out.println("Por favor, digite o valor do seu depósito!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numero + ", e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
