package game.mecanicaDoJogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FabricaMecanicaDoJogo {
private static List<MecanicaDoJogo> me = new ArrayList<MecanicaDoJogo>();
	
	static {
		me.add(new ModoFiveTimes());
		me.add(new ModoDuasVezes());
		me.add(new ModoAteErrar());
	}
	
	public static MecanicaDoJogo getMecanica() {
		Random rNum = new Random();
		int pos = rNum.nextInt(me.size());
		return me.get(pos);
	}
}
