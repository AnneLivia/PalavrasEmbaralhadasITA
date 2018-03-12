package testePalavrasEmbaralhadas;

import static org.junit.Assert.*;

import org.junit.Test;

import game.palavras.Embaralhador;
import game.palavras.PalavrasImparPar;
import game.palavras.PalavrasInvertidas;
import game.palavras.PalavrasPeloMeio;

public class TesteEmbaralhador {

	@Test
	public void testParInparEmbralhador() {
		Embaralhador em = new PalavrasImparPar();
		String word = em.palavraEmbaralhada("Baralho");
		assertEquals("Brloaah",word);
	}
	
	@Test
	public void testInverterEmbralhador() {
		Embaralhador em = new PalavrasInvertidas();
		String word = em.palavraEmbaralhada("Palavra");
		assertEquals("arvalaP",word);
	}
	
	@Test
	public void testMeioPalavra() {
		Embaralhador em = new PalavrasPeloMeio();
		String word = em.palavraEmbaralhada("Alemanha");
		assertEquals("anhamelA",word);
	}
}
