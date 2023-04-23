
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainE {
	
	//throws serve para lançar exceções do tipo de Entrada e Saída
	public static void main(String[] args) throws IOException {
		
		//classe para permitir o usuario digitar
		InputStream teclado=System.in;
		System.out.println("Digite seu nome");
		
		//classe que vai receber do teclado
		InputStreamReader recebe=new InputStreamReader(teclado);
		
		//O BufferedReader lê o texto de um fluxo de entrada de caracteres,
		BufferedReader ler=new BufferedReader(recebe);
		
		//readLine é usado para ler um texto de uma linha especificamente do console.
		String digitados=ler.readLine();
		
		
		while(digitados!=null) {
			System.out.println("nome:"+digitados);
			 digitados=ler.readLine();
		}
		
	}
}
