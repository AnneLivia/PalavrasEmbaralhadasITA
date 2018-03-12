package game.palavras;

public class PalavrasImparPar implements Embaralhador {

	@Override
	public String palavraEmbaralhada(String palavra) {
		String parInparWord = "";
		char[] wordChar = palavra.toCharArray();
		for(int i = 0; i < palavra.length(); i+=2) {
			parInparWord += wordChar[i];
		}
		for(int i = 1; i < palavra.length(); i+=2) {
			parInparWord += wordChar[i];
		}
		return parInparWord;
	}

}
