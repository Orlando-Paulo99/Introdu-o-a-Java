package Pg;
import java.util.Scanner;
import java.util.Arrays;

public class arrayexercicio7 {

  public static void main(String[] args) {
  
  int[] array={10,20,30,40,50};
  
 Scanner entrada=new Scanner(System.in);
 System.out.println("Digite um nunero");
 int saida=entrada.nextInt();
 for(int i=0;i<array.length;i++){
   
 }
 if(saida==10){
     System.out.printf("Posição 0 "+Arrays.toString(array));
   }
   
 if(saida==20){
       System.out.printf("Posição 1 "+Arrays.toString(array));
   
 }
 
 if (saida==30){
   System.out.printf("Posição 2"+Arrays.toString(array));
 }
 
 if (saida==40){
   System.out.printf("Posição 3 "+Arrays.toString(array));
 }
 
 if(saida==50){
   System.out.printf("Posição 4 "+Arrays.toString(array));
 }
 
 else {
   System.out.println("Número não encontrado ");
 
   System.out.println("Digite um número ");
   int saida1=entrada.nextInt();
 }
  





  }

}
