import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//escreveArquivo();
		//leArquivo();
		Conta caixa2 = new Conta(20000, "Aecio",12344);
		caixa2.creditar(100);
		caixa2.debitar(10200);
		caixa2.creditar(120);
		caixa2.debitar(100);
		caixa2.creditar(280);
		caixa2.creditar(5000);
		caixa2.debitar(800);
		caixa2.creditar(1400);
		caixa2.salvar("d://");
	}
	

	public static void escreveArquivo() {
		String end = "d://teste.txt";

		try {
			FileWriter file = new FileWriter(end);
			BufferedWriter objEscrita = new BufferedWriter(file);
			// PrintWriter escreve = new PrintWriter(file);
			// escreve.print("Escrevi no arquivo");

			objEscrita.write("Esse texto está sendo inserido");
			objEscrita.newLine();
			objEscrita.write("Atirei o pau no gato");
			objEscrita.newLine();
			objEscrita.write("Mas o gato não morreu");
			objEscrita.newLine();
			objEscrita.write("Dona Xica");
			objEscrita.flush();
			objEscrita.close();
			file.close();

			System.out.println("Rodou");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void leArquivo() {
		String end = "d://teste.txt";
		
		try {
			FileReader arquivo = new FileReader(end);
			BufferedReader leitura = new BufferedReader(arquivo);
			String linha = leitura.readLine();
			while(linha !=null){
				System.out.println(linha);
				linha=leitura.readLine();
			}	
			leitura.close();
			arquivo.close();
		} catch (Exception e) {e.toString();
			System.out.println(e.toString());

		}
	}
}
