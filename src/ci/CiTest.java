package ci;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiTest {

	@Test
	public void test() 
	{
		Ci ci = new Ci();
		string string = ci.hello_world();
		assertTrue("string = 'Hello World!", string.equals("Hello World!"));
	}

}
