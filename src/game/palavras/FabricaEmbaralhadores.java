package game.palavras;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaEmbaralhadores {
	private static List<Embaralhador> em = new ArrayList<Embaralhador>();
	
	static {
		em.add(new PalavrasImparPar());
		em.add(new PalavrasInvertidas());
		em.add(new PalavrasPeloMeio());
	}
	
	public static Embaralhador getEmbaralhador() {
		Random rNum = new Random();
		int pos = rNum.nextInt(em.size());
		return em.get(pos);
	}
}
