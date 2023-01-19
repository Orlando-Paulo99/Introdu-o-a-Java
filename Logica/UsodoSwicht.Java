import java.util.Scanner;
public class logica4 {

  public static void main(String[] args) {
  //Case1
  System.out.println("1 Menor de idade");
  //case2
  System.out.println("2 Maior de 18 anos");
  //Case3
  System.out.println("3 Idoso");
  
  //VARIÁVEL QUE RECEBE O VALOR DAS OPÇÕES ACIMA
  int idade=5;
  
  
  //Estrutura condicional referente ao valor attibuido a variável
  switch (idade){
    case 1:
    System.out.println("De menor");
    break;
    case 2:
    System.out.println("maior de 18 anos");
    break;
    
    case 3:
    System.out.println("Idoso");
    break;
    
    default:
    System.out.println("Opção inválida");
    break;
  }
  
  }

}
