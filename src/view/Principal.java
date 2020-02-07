package view;
import controller.operacoesController;

public class Principal {

	public static void main(String[] args) {

		operacoesController opcon = new operacoesController();
//		opcon.operacaoString();
//		opcon.operacaoBuffer();		
		String frase = "Bem vindos de volta";
		opcon.operacaoFrase(frase);
	}
}
