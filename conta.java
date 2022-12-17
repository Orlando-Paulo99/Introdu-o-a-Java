package Banco;

public abstract class conta {

public String nome;
private double saldo;
public int  nConta;
private int cpf;

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

public int getmostrar_cpf(){
  return this.cpf;
}
public void setdigitar_cpf(int z){
  this.cpf=z;
}




}
