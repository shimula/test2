package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testGreeding() {
		Hello hello = new Hello();
		assertEquals("Hello", hello.greeding());
	}
}
