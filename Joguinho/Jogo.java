import java.util.Scanner;

public class jogo {

  public static void main(String[] args) {
  
       Scanner recebe_user=new Scanner(System.in);
       System.out.println("Sejam-Bem vindo!\nComo você se chama? ");
       String user=recebe_user.next();
       System.out.printf("Olá %s, Seja bem-vido(a)!",user);
    System.out.println("\n1-Sim\n2-Não");
       int sn=recebe_user.nextInt();
       int[] numero={2};
       int cont=0;
       if (sn!=1){
         System.out.println("Vamos nessa "+user+" uhuh!");
       }
      
     
      for(;;){
     System.out.println("Temos um numero inteiro dentro de uma caixa misteriosa e a sua missão é digitar um número entre 1 e 10 e você terá três chances Vamos nessa!\nEscolha um número entre 1 e 10");
    int resp=recebe_user.nextInt();
     
      
      if(resp==2){
        System.out.println("PARABÉNS VOCÊ É FERA DEMAIS!");
        break;
        
      }
      
      
      
     if(resp!=2){}
     
        System.out.println("OPAA,NÃO FOI DESSA VEZ,TENTE NOVAMENTE \nEscolha um número inteiro emtre 1 e 10");
       int respa=recebe_user.nextInt();
        cont+=1;
        }
        
     
        
      }
       
      
      
      
    
    
          
       
       
       




  }

}
