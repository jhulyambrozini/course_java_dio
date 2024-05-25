import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta!");
        int accountNumber = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        String agencyNumber = scanner.nextLine();

        System.out.println("Por favor, digite seu nome!");
        String nameClient = scanner.nextLine();

        System.out.println("Por favor, digite o valor do saldo!");
        String balanceString = scanner.nextLine();

        double balance = Double.parseDouble(balanceString);

        System.out.println("Olá, " + nameClient +" obrigado por criar uma conta em nosso banco, sua agência é " + agencyNumber + ", conta " + accountNumber +" e seu saldo "+ balance +" já está disponível para saque");

        scanner.close();

    }
}
