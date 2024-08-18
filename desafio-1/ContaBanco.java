import java.util.Scanner;

public class ContaBanco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao Shogun Bank!");

		System.out.print("Inserir número da conta: ");
		int account = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Inserir agência: ");
		int agency = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Nome do cliente: ");
		String client = scanner.nextLine();

		System.out.print("Saldo: ");
		double balance = scanner.nextDouble();
		scanner.nextLine();

		String message1 = String.format("Olá Sr %s, obrigado por criar uma conta em nosso banco!", client);
		System.out.println(message1);
		String message2 = String.format("Sua conta é %d, sua agência é %d e seu saldo atual é %f", account, agency, balance);
		System.out.println(message2);

		scanner.close();
	}
}

