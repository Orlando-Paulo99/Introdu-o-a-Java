package Pg;
import java.util.Scanner;

public class logica {

  public static void main(String[] args) {
   
   String seg="Segunda ";
   String ter="Terça";
   String qua="Quarta";
   String qui="Quinta";
   String sex="Sexta";
   String sab="Sábado";
   String dom="Domingo";
   
   
   Scanner perg= new Scanner(System.in);
   System.out.println("Digite um número de acordo com o dia da semana");
   int resp= perg.nextInt();
   
   if (resp==1){
     System.out.println(seg);
   }
   else if (resp==2){
     System.out.println(ter);
   }
   else if (resp==3){
     System.out.println(qua);
   }
   
   else if (resp==4){
     System.out.println(qui);
   }
   else if (resp==5){
     System.out.println(sex);
   }

   else if(resp==6){
     System.out.println(sab);
   }
   else if (resp==7){
     System.out.println(dom);
   }
   else{
     System.out.println("Apenas 1,2,3,4,5,6 ou 7");
   }
  
  
  }
}
