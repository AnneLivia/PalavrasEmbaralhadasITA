package game.mecanicaDoJogo;

import game.dataBasePalavras.BancoDePalavras;

public class ModoAteErrar implements MecanicaDoJogo {

	static private BancoDePalavras palavraSorteada = new BancoDePalavras();
	static private boolean errou;
	static private int pontuacao = 0;
	
	@Override
	public String getPalavra() {
		return palavraSorteada.getPalavra();
	}

	@Override
	public String modoGame() {
		return "At� Errar";
	}

	@Override
	public String descricaoGame() {
		// TODO Auto-generated method stub
		return "Voc� ir� jogar at� errar uma palavra";
	}

	@Override
	public String resposta(String word, String answer) {
		if(word.equals(answer)) {
			pontuacao+=20;
			return "Resposta Certa";
		}
		errou = true;
		return "Resposta Errada";
	}

	@Override
	public String resultado() {
		return "Voc� fez: "+pontuacao+" pontos";
	}

	@Override
	public boolean fimDeJogo() {
		if(errou)
			return true;
		return false;
	}

}
