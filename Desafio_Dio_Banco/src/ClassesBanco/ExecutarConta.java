package ClassesBanco;

public class ExecutarConta {

	public static void main(String[] args) {
		
		Conta cc  = new ContaCorrente();
		cc.depositar(1500);
		
		Conta cp  = new ContaPoupanca();
		
		cc.transferir(1600, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		

	}

}
