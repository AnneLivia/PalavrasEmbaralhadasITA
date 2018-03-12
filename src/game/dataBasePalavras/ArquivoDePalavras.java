package game.dataBasePalavras;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ArquivoDePalavras {
	private static Scanner x;
	private static ArrayList<String> word = null;
	public static void openFile() {
		try {
			word = new ArrayList<String>();
			x = new Scanner(new File("C:\\Users\\annel\\Documents\\Eclipse\\JogoPalavrasEmbaralhadas\\bankWords.txt"));
		} catch(Exception e) {
			word = null;
		}
	}
	
	public static ArrayList<String> readFile() {
		while(x.hasNext()) {
			String a = x.next();
			word.add(a);
		}
		return word;
	}
	
	public static void closeFile() {
		x.close();
	}
}
