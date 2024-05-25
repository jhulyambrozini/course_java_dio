import banco_digital.Cliente;
import banco_digital.Conta;
import banco_digital.ContaCorrente;
import banco_digital.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente jhuly = new Cliente();
		jhuly.nome = "Jhuly";
		
		Conta cc = new ContaCorrente(jhuly);
		Conta poupanca = new ContaPoupanca(jhuly);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}