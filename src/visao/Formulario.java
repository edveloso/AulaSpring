package visao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import controle.Relatorio;



/**
 * Criem uma classe chamada ContaPoupanca no modelo
 * esta classe vai ter alem de nome e numeroConta,
 * o saldoPoupanca. Este ultimo atributo é double.
 * Crie um metódo mostrarDadosConta nesta nova classe.
 * 
 *  No Relatorio permita que o método mostrar imprimeDadosConta
 *  tambem imprima dados de contaPoupanca alternativamente 
 *  a ContaCorrente.
 * 
 * 
 * @author edveloso
 *
 */

public class Formulario {

	public static void main(String[] args) {
	
		//Pegar a instancia de contexto do spring
ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml"); 
   Relatorio relatorio =  (Relatorio) ctx.getBean("oRelatorio");
   relatorio.imprimeDadosConta();
		
		
		
		
	}
	
}
