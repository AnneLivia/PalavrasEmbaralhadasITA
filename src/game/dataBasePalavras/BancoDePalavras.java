package game.dataBasePalavras;

import java.util.ArrayList;
import java.util.Random;

public class BancoDePalavras {
	
	private ArrayList<String> words = null;
	
	public BancoDePalavras() {
		ArquivoDePalavras.openFile();
		words = ArquivoDePalavras.readFile();
		ArquivoDePalavras.closeFile();
	}
	
	public String getPalavra() {
		Random raNumber = new Random();
		int pos = raNumber.nextInt(words.size());
		return words.get(pos).toLowerCase();
	}
}
