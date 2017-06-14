import java.io.BufferedWriter;
import java.io.FileWriter;

public class Conta {
	double saldo;
	String titular;
	int numero;

	// Construtor da classe
	public Conta(double saldo, String nome, int numero) {
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
			System.out.println("Saldo Insuficiente na conta " + titular);
			return 0;
		}
	}

	public void creditar(double valor) {
		saldo = saldo + valor;
		System.out.println("valor creditado. Novo saldo " + saldo + " da conta " + titular);

	}

	public void salvar(String caminho) {
		String end = caminho + "/Conta" + numero + ".txt";
		try {
			FileWriter arquivo = new FileWriter(end);
			BufferedWriter escrita = new BufferedWriter(arquivo);
			escrita.write(String.valueOf(saldo));
			escrita.newLine();
			escrita.write(String.valueOf(numero));
			escrita.newLine();
			//escrita.write(extrato.toString());
			//escrita.newLine();
			escrita.close();
			arquivo.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
