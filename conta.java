public abstract class conta {

public String nome;
private double saldo;
public int  nConta;

public double getmostrarDeposito(){
    return this.saldo;
  
}


public void  setDepositar(double x){
 this.saldo=this.saldo+x;
}




public void  setSacar(double y){
  this.saldo=this.saldo-y;
  if(  y> this.saldo){
    System.out.println("Saque insuficiente");
  }
}

public double getmostrarSaldo(){
  return  this.saldo;
}





}

