package controle;

import modelo.Conta;

public class Relatorio {

	//Progrmar para interfaces e n‹o para classes concretas
	private Conta conta;
	
	
    public void imprimeDadosConta(){
		conta.mostrarDadosConta();
	}


	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
}



