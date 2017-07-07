package HashTable;

public class HashMap implements Interface {
	String[] s = new String[50];
	int temp = 0;

	@Override
	public void add(String x, int value) {
		char[] sm = x.toLowerCase().toCharArray();
		for (int i = 0; i < sm.length; i++) {
				temp += sm[i];
				temp = temp%50;
		}
	}

	@Override
	public void get(int index) {

	}

}
