package tests;

import org.junit.Test;
import main.Greeter;
import static org.junit.Assert.*;

public class GreeterTest
{
	@Test
	public void testGreeter()
	{
		Greeter greeter = new Greeter();
		assertEquals("Hello",greeter.greet());
	
	}
}