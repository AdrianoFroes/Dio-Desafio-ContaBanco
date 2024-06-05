package ClassesBanco;

public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDstino);
	
	void imprimirExtrato();

}
