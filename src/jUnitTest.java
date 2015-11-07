import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class jUnitTest {
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("Executed Before Class Method");
	}

	@Before
	public void beforeTest() {
		System.out.println("Running Before Test");
	}

	@Test
	public void junitTest() {
		System.out.println("Running JUnit Test");
	}

	@Test
	public void secondJunitTest() {
		System.out.println("Running Second JUnit Test");
	}

	@After
	public void afterTest() {
		System.out.println("Running After Method");
	}

	@AfterClass
	public static void afterClassTest() {
		System.out.println("Running After Class Method");
	}
}