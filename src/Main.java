
public class Main {
	
	public static void main(String[] args) {
		Cliente denner = new Cliente();
		denner.setNome("denner");
		Conta cc = new ContaCorrente(denner);
		Conta poupanca = new ContaPoupanca(denner);
		
		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		
	}
}
