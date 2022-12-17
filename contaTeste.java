package Banco;

import Banco.contaCorrente;


public class contaTeste {

  public static void main(String[] args) {
     contaCorrente c1=new contaCorrente();
     c1.nome1="Orlando";
     c1.numConta=14668;
     c1.cpf_1=122377789;
     
     c1.setDepositar(100);
     
            
            
            
     c1.setSacar(10);
     
    System.out.printf("Nome:%s \nNumer da Conta:%d \nCPF:%d ",c1.nome1,c1.numConta,c1.cpf_1);       
      System.out.println("\nSeu saldo é: "+c1.getmostrarSaldo());
            
    
  }

}
