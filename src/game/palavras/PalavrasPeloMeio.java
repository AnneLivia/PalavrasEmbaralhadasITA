package game.palavras;

public class PalavrasPeloMeio implements Embaralhador{

	@Override
	public String palavraEmbaralhada(String palavra) {
		String word = "";
		int pos = palavra.length() / 2;
		word += palavra.charAt(pos);
		for(int i = pos + 1; i < palavra.length(); i++)
			word+=palavra.charAt(i);
		for(int i = pos - 1; i >= 0; i--)
			word+=palavra.charAt(i);
		
		return word;
	}
	
}
