package Fundamentos;

public class array1 {

	public static void main(String[] args) {
		//criando um array
		/*int[] intArray= {2,5,46,12,34};
		//ciando um lanço para contar meu array
		for (int i=0; i<intArray.length;i++) {
		//printando meu array
			System.out.print(intArray[i]+ "-");
		}*/
		
		
			
		int[] intA=new int[10];
		intA[1]= 19;
		for (int b=0;b<intA.length; b++) {
			
			intA[b]= b+19;
			System.out.print(intA[b]+ ", ");
			
			
			
			
		}
		
	}

}
