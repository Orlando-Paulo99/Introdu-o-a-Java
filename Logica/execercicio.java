package Fundamentos;
import java.util.Scanner;
public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Telefonou para vitma(s/n)");
		String resp1=entrada.nextLine();
		System.out.println("Esteve no local com a vitima(s/n)");
		String resp2=entrada.nextLine();
		System.out.println("Mora perto da vitima(s/n)");
		String resp3=entrada.next();
		System.out.println("Devia para vitima(s/n)");
		String resp4=entrada.next();
		System.out.println("Já trabalhou perto da vitima(s/n)");
		String resp5=entrada.next();
		
		
		int cont=0;
		if (resp1.equalsIgnoreCase("s")) {
			cont=cont+1;

		}
		if (resp2.equalsIgnoreCase("s")) {
			cont=cont+1;
			
		}
		if (resp3.equalsIgnoreCase("s")) {
			cont=cont+1;
		}
		if (resp4.equalsIgnoreCase("s")) {
			cont=cont+1;
		
		}
		
		if (resp5.equalsIgnoreCase("s")) {
			cont=cont+1;
			
		
		}
		
		
		if (cont==2) {
			System.out.println("Suspeito");
		}
		else if(cont==3 || cont==4) {
			System.out.println("Cumplice");
		}
		else if (cont==5) {
			System.out.println("Assasino");
		}
		else {
			System.out.println("Inocente");
		}
			
	
		
	}

}
