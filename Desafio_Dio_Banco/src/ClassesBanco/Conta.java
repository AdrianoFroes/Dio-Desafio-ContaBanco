package ClassesBanco;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	

	public Conta() {
		
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
	}
	
	
	public void sacar() {
		
	}
	
	public void depositar() {
		
	}
	
	public void transferir() {
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contaDstino) {
		this.sacar(valor);
		contaDstino.depositar(valor);
		
	}
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		   System.out.println(String.format("Numero: %d", this.numero));
		   System.out.println(String.format("Saldo R$ %.2f", this.saldo));
	}
	

}
