
public class Conta {
	double saldo;
	String titular;
	int numero;
	
	//Construtor da classe
	public Conta(double saldo, String nome, int numero){
		this.saldo = saldo;
		this.numero = numero;
		this.titular = nome;
		
	}

	public int debitar(double valor) {
		if (valor < saldo) {
			saldo = saldo - valor;
			System.out.println("valor debitado na conta " + titular);
			return 1;
		} else {
			System.out.println("Saldo Insuficiente na conta "+titular);
			return 0;
		}
	}

	public void creditar(double valor) {
		saldo = saldo + valor;
		System.out.println("valor creditado. Novo saldo " + saldo + " da conta " + titular);
	}
}
