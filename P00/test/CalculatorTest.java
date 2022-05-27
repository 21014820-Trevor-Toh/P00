import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	int a, b;
	Calculator cal;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a=4321;
		b=1234;
		cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		int actual = cal.add(a, b);
		int expected =5555;
		assertEquals(expected,actual);

	}
	@Test
	public void testSub() {
		int actual = cal.sub(a, b);
		int expected = 3087;
		assertEquals(expected,actual);
	}
	@Test
	public void testmult() {
		int actual = cal.mult(a, b);
		int expected = 5332114;
		assertEquals(expected,actual);
	}
	@Test
	public void testdiv() {
		int actual = cal.div(a, b);
		int expected = 3;
		assertEquals(expected,actual);
	}

}
