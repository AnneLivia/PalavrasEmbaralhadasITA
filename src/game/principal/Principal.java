package game.principal;

import java.util.Scanner;

import game.mecanicaDoJogo.FabricaMecanicaDoJogo;
import game.mecanicaDoJogo.MecanicaDoJogo;
import game.palavras.Embaralhador;
import game.palavras.FabricaEmbaralhadores;

public class Principal {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		MecanicaDoJogo me = FabricaMecanicaDoJogo.getMecanica();
		System.out.println("Modo do Jogo: "+me.modoGame());
		System.out.println("Decrição: "+me.descricaoGame());
		
		while(!me.fimDeJogo()) {
			Embaralhador e = FabricaEmbaralhadores.getEmbaralhador();
			String word = me.getPalavra();
			String embaralhada = e.palavraEmbaralhada(word);
			System.out.println("Qual é esta palavra ?\n"+embaralhada);
			System.out.print("Resposta: ");
			String answer = input.nextLine().toLowerCase();
			System.out.println(me.resposta(word, answer));
		}
		
		System.out.println(me.resultado());
	}
}
