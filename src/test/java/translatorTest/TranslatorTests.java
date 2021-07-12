package translatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import morseTranslate.Translator;

public class TranslatorTests {

	@Test
	public void test1() {
		String expected = "JAVA IS COOL OK";
		String actual = Translator.translator(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-");
		assertEquals(expected, actual);
	}

}
