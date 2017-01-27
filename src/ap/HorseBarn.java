package ap;

public class HorseBarn {
	private Horse[] spaces;

	public void setSpaces(Horse[] m) {
		spaces = m;
	}

	public Horse[] getSpaces() {
		return spaces;
	}

	static public HorseBarn createTestBarn() {
		HorseBarn horseBarn = new HorseBarn();
		Horse[] horsey = new Horse[7];
		horsey[0] = new Horse("Trigger", 1340);
		horsey[1] = null;
		horsey[2] = new Horse("Silver", 1210);
		horsey[3] = new Horse("Lady", 1575);
		horsey[4] = null;
		horsey[5] = new Horse("Patches", 1350);
		horsey[6] = new Horse("Duke", 1410);
		horseBarn.setSpaces(horsey);
		return horseBarn;
	}

	public void consolidate() {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] == null) {
				if (i > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 1 > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 2 > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 3 > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 4 > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 5 > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 6 > spaces.length - 1) {
					i = spaces.length - 1;
				} else if (i + 7 > spaces.length - 1) {
					i = spaces.length - 1;
				}
				spaces[i] = spaces[i + 1];
				spaces[i + 1] = spaces[i + 2];
				spaces[i + 2] = spaces[i + 3];
				spaces[i + 3] = spaces[i + 4];
				spaces[i + 4] = spaces[i + 5];
				spaces[i + 5] = spaces[i + 6];
				spaces[i + 6] = spaces[i + 7];
			}
		}
	}

	public int findHorseSpace(String string) {
		int x = 0;
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i] == null) {
				i++;
			}
			if (string == spaces[i].getName()) {
				x = i;
				return x;
			}
		}
		return -1;
	}
}