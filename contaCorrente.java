public abstract class conta  {
	private double saldo;
	
	//Sacando saldo
	public void  setSacar(double x) {
		this.saldo=this.saldo-x;
		
		
	}
	//Depositanto valor
	public void setDepositar(double z) {
		this.saldo=this.saldo+z;
	
	}
	public double getVersaldo() {
		return this.saldo;
	}



}
