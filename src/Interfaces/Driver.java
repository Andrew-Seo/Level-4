package Interfaces;

public class Driver {	
	public static void main(String[] args) {
		Robot s = new Robot();
		s.setNoise(new Boop());
		s.blap();
		s.setNoise(new Beep());
		s.blap();
	}
}
