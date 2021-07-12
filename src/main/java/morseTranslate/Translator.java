package morseTranslate;

import java.util.HashMap;
import java.util.Map;

public class Translator {

	static Map<String, String> morseMap = new HashMap<>();

	static { // initialisation block, runs in the order of things
		morseMap = new HashMap<>();
		morseMap.put(".-", "A");
		morseMap.put("-...", "B");
		morseMap.put("-.-.", "C");
		morseMap.put("-..", "D");
		morseMap.put(".", "E");
		morseMap.put("..-.", "F");
		morseMap.put("--.", "G");
		morseMap.put("....", "H");
		morseMap.put("..", "I");
		morseMap.put(".---", "J");
		morseMap.put("-.-", "K");
		morseMap.put(".-..", "L");
		morseMap.put("--", "M");
		morseMap.put("-.", "N");
		morseMap.put("---", "O");
		morseMap.put(".--.", "P");
		morseMap.put("--.-", "Q");
		morseMap.put(".-.", "R");
		morseMap.put("...", "S");
		morseMap.put("-", "T");
		morseMap.put("..-", "U");
		morseMap.put("...-", "V");
		morseMap.put(".--", "W");
		morseMap.put("-..-", "X");
		morseMap.put("-.--", "Y");
		morseMap.put("--..", "Z");
		morseMap.put("/", " ");

	}

	public static String translator(String x) {
		String output = ""; // initialise the output variable, using "" as a blank value
		String[] morse = x.split(" "); // splits string by spaces
		for (String m : morse) { // iterates through each morse character inputed
			output += morseMap.get(m); // += adds each key (morse input) switched to its value (the letter)
		}
		return output;
	}

}
