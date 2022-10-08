
public class Main {

	public static void main(String[] args) {
		Cliente edison = new Cliente();
		edison.setNome("Edison");
		Conta cc = new ContaCorrente(edison);
		
		Conta poupanca = new ContaPoupanca(edison);
		cc.depositar(100);
		cc.transferir(100, poupanca);
	
		Cliente maria = new Cliente();
		maria.setNome("Maria");

		Conta cd = new ContaCorrente(maria);

		Conta poupancas = new ContaPoupanca(maria);
		cd.depositar(500);
		cd.transferir(300, poupancas);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cd.imprimirExtrato();
		poupancas.imprimirExtrato();

	}

}
