package modelo;

public class ContaCorrente implements Conta{

	private String numeroConta;
	private String nomeCorrentista;
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	public void mostrarDadosConta(){
		System.out.print("Correntista: "+ this.nomeCorrentista);
		System.out.println(" Numero da Conta: " + this.numeroConta); 
	}
	
	
}









