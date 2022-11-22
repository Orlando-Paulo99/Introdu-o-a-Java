package Fundamentos;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite um numero");
		int resp=entrada.nextInt();
		System.out.println(resp);
		if(resp < 0) {
			System.out.println("Negativo");
		}
		else if (resp==0) {
			System.out.println("neutro");
		}
		else {
			System.out.println("Positivo");
		}
		
	}
	
}
