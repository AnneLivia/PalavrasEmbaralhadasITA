package game.mecanicaDoJogo;

public interface MecanicaDoJogo {
	public String getPalavra();
	public String modoGame();
	public String descricaoGame();
	public String resposta(String word, String answer);
	public String resultado();
	public boolean fimDeJogo();
}
