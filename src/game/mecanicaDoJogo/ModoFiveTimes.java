package game.mecanicaDoJogo;

import game.dataBasePalavras.BancoDePalavras;

public class ModoFiveTimes implements MecanicaDoJogo{
	static private BancoDePalavras palavraSorteada = new BancoDePalavras();
	static private int contTimes = 0;
	@Override
	public String getPalavra() {
		contTimes++;
		return palavraSorteada.getPalavra();
	}

	@Override
	public String modoGame() {
		return "FiveTimes";
	}

	@Override
	public String descricaoGame() {
		// TODO Auto-generated method stub
		return "Você precisa acertar todas as 5 palavra";
	}

	@Override
	public String resposta(String word, String answer) {
		if(word.equals(answer))
			return "Resposta Certa";
		contTimes = 10;
		return "Resposta Errada";
	}

	@Override
	public String resultado() {
		if(contTimes == 10)
			return "Você perdeu o jogo\n";
		return "Você ganhou, acertou todas as cinco palavras\n";
	}

	@Override
	public boolean fimDeJogo() {
		if(contTimes >= 5)
			return true;
		else
			return false;
	}

}
