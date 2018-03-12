package game.palavras;

public class PalavrasInvertidas implements Embaralhador {

	@Override
	public String palavraEmbaralhada(String palavra) {
		String inverseWord = "";
		for(int i = palavra.length() - 1; i >= 0; i--) {
			inverseWord += palavra.charAt(i);
		}
		return inverseWord;
	}

}
