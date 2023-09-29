import java.util.Scanner; // 1. Importando a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2. Exibir mensagens para o usuário e obter valores via Scanner
        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta. ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        System.out.println("Por favor, digite o nome do Cliente. ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta. ");
        double saldo = scanner.nextDouble();

        // 4. Exibir a mensagem da conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
