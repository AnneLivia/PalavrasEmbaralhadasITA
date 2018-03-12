package game.mecanicaDoJogo;

import game.dataBasePalavras.BancoDePalavras;

public class ModoDuasVezes implements MecanicaDoJogo {
	static private BancoDePalavras palavraSorteada = new BancoDePalavras();
	static private int contErro = 0;
	static private int limit = 0;
	@Override
	public String getPalavra() {
		limit++;
		return palavraSorteada.getPalavra();
	}

	@Override
	public String modoGame() {
		return "Duas Vezes";
	}

	@Override
	public String descricaoGame() {
		// TODO Auto-generated method stub
		return "Você terá um limite de dez palavras, poderá errar até duas vezes, caso contrario você perde";
	}

	@Override
	public String resposta(String word, String answer) {
		if(word.equals(answer))
			return "Resposta Certa";
		contErro++;
		return "Resposta Errada";
	}

	@Override
	public String resultado() {
		if(contErro == 2)
			return "Você perdeu o jogo, errou duas vezes\n";
		return "Você ganhou, não errou duas ou mais vezes\n";
	}

	@Override
	public boolean fimDeJogo() {
		if(contErro >= 2 || limit >= 10)
			return true;
		else
			return false;
	}
}
