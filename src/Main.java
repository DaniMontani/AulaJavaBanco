import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//ArrayList:<objeto> usuario = new ArrayList<objeto> usuario();
		  ArrayList<String> usuario= new ArrayList<String>();
		  Scanner Scan=new Scanner(System.in);
		  String Fulano = Scan.nextLine(); 
		  while(!Fulano.equals("sair")){
			  usuario.add(Fulano);
			  Fulano = Scan.nextLine();
		  }
		  for(int i=0;i<usuario.size();i++){
			  System.out.println(usuario.get(i));
		  }
		  
		  
	}

}
