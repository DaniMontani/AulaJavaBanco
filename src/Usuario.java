
public class Usuario {
 String nome;
 int CPF;
 String Endereco ;
 Conta conta;
 
 public Usuario(String nome, int CPF, Conta conta){
	 this.nome = nome;
	 this.CPF = CPF;
	 this.conta= conta;
 }
 

 public Usuario(String nome, int CPF, String endereco, Conta conta) {
	this.nome = nome;
	this.CPF = CPF;
	this.Endereco = endereco;
	this.conta = conta;
}


public void saque (double valor){
	 conta.debitar(valor);
	 
 }
public void deposito (double valor){
	conta.creditar(valor);
}

public void transferencia (double valor, Conta contadestino){
	int retorno = conta.debitar(valor);
	if(retorno ==1){
		contadestino.creditar(valor);
	}
}
}