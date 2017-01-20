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
	
	public int findHorseSpace (String string){
		int x = 0;
		Horse[] temp = getSpaces();
		for (int i = 0; i < temp.length; i++) {
			if(string == temp[i].getName()){
				x = i;
			}
			else {
				x = -1;
			}
			
		}
		return x;
	}
}
