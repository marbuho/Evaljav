
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test; // para usaar anotación @test

import clasesausar.Conversor;

public class Test_Conversor{

	@Test
	 public void testconversionromanos(){
		
		assertTrue(Conversor.to_romano(0).equals(""));
		assertTrue(Conversor.to_romano(1).equals("I"));
		assertTrue(Conversor.to_romano(49).equals("XLIX"));
		assertTrue(Conversor.to_romano(4).equals("IV"));
		assertTrue(Conversor.to_romano(200).equals("CC"));
		assertTrue(Conversor.to_romano(8499).equals("MMMMMMMMCDXCIX"));
		assertTrue(Conversor.to_romano(9999).equals("MMMMMMMMMCMXCIX"));
		
		assertTrue(Conversor.to_romano(3,true).equals("iii"));
		
		assertTrue(Conversor.to_romano(1001, true).equals("mi"));
		
	}

}
