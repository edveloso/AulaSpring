package modelo;

public class ContaPoupanca implements Conta{

	private String nome;
	private String numero;
	private double saldo;
	
	public void mostrarDadosConta(){
		System.out.println("ContaPoupanca [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (numero != null ? "numero=" + numero + ", " : "") + "saldo="
				+ saldo + "]");
	}

	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return saldo;
	}




	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	
}
