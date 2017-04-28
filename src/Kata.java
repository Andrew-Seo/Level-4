
public class Kata {
	public static String autocorrect(String x) {
		String y = x;
		String alphabet = "a b c d e f g h i j k l m n p q r s t v w x z";
		String alphabets[] = alphabet.split(" ");
		String split[] = x.split(" ");
		if(x.equals("youtube")){
			System.out.println("a");
		}
		if (x.contains("y") && x.contains("o") && x.contains("u")) {
			for (int i = 0; i < alphabets.length; i++) {
				if (x.contains(alphabets[i])) {
					x = y;
					return x;
				}}
				
					for (int j = 0; j < split.length; j++) {
						split[j] = "your sister";
						x = split[j];
						return x;
					}
				}
			


		if (x.contains("Y") && x.contains("o") && x.contains("u")) {
			for (int i = 0; i < alphabets.length; i++) {
				if (x.contains(alphabets[i])) {
					return x;
				} else {
					for (int j = 0; j < split.length; j++) {
						split[j] = "your sister";
						x = split[j];
					}
				}
			}
		}
		if (x == "u") {
			x = "your sister";
		}
		if (x == "U") {
			x = "your sister";
		}
		return x;
	}
}
