package sw.audio;

import arc.audio.*;
import mindustry.*;

public class ModSounds {
	public static Sound sonarShoot, awareness;

	public static void load() {
		sonarShoot = Vars.tree.loadSound("SonarShoot");
		awareness = Vars.tree.loadSound("Awareness");
	}
}
