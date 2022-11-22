package Fundamentos;
import java.util.Scanner;


public class exercicio02 {

	public static void main(String[] args) {
		
				Scanner entrada1=new Scanner(System.in);
				System.out.println("Digite o primerip numero");
				int resp1=entrada1.nextInt();
				System.out.println(resp1);
				
				Scanner entrada2=new Scanner(System.in);
				System.out.println("Digite o segundo numero");
				int resp2=entrada1.nextInt();
				System.out.println(resp2);
				

				Scanner entrada3=new Scanner(System.in);
				System.out.println("Digite o terceiro numero");
				int resp3=entrada3.nextInt();
				System.out.println(resp3);
				
				if (resp1 > resp2 ) {
					System.out.println("Maior numero");
				}
				
				else if (resp2 > resp3) {
					System.out.println("O maior numero");
				}
				else if (resp3 > resp1) {
					System.out.println("O maior numero");
					
				}
