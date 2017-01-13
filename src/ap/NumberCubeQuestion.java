package ap;

public class NumberCubeQuestion {
	public static int getGreatestNumber(int[] arrays) {
		int x = arrays[0];
		for (int i = 0; i < arrays.length; i++) {
			if (x < arrays[i]) {
				x = arrays[i];
			}
		}
		return x;
	}

	public static int[] getCubeTosses(NumberCube numberCube, int numTosses) {
		int[] results = new int[numTosses];
		for (int i = 0; i < results.length; i++) {
			results[i] = numberCube.toss();
		}
		return results;
	}

	public static int getLongestRun(int[] arrays) {
		int curRun = 0;
		int longestRun = 0;
		int index = 0;

		for (int i = 0; i < arrays.length - 1; i++) {

			if (arrays[i] == arrays[i + 1]) {
				curRun++;

			}
			if (curRun > longestRun) {
				longestRun = curRun;
				index = i - longestRun + 1;
			}

			if (arrays[i] != arrays[i + 1]) {
				curRun = 0;
			}
		}

		if (longestRun == 1) {
			return -1;
		}

		System.out.println(index);
		return index;
	}

}
