import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModelTest2 {

	private Model model;
	int first,second;
	@Before
	public void setUp() throws Exception {
		model = new Model();
		first=10;
		second=5;
		model.setFirstNum(first);
		model.setSecondNum(second);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testModel() {
		assertNotNull(model);
	}

	@Test
	public void testGetFirstNum() {
		
		assertEquals(10,model.getFirstNum());
	}

	@Test
	public void testSetFirstNum() {
		model.setFirstNum(first);
		assertEquals(10,model.getFirstNum());
	}

	@Test
	public void testGetSecondNum() {
		assertEquals(5,model.getSecondNum());
	}

	@Test
	public void testSetSecondNum() {
		model.setSecondNum(11);
		assertEquals(11,model.getSecondNum());
	}

	@Test
	public void testAddition() {
		
		model.addition();
		assertEquals(15,model.getResult());
	}

	@Test
	public void testSubtraction() {
		model.subtraction();
		assertEquals(5,model.getResult());
	}

	@Test
	public void testMultipication() {
		model.multipication();
		assertEquals(50,model.getResult());
	}

	@Test
	public void testDivision() {
		model.division();
		assertEquals(2,model.getResult());
	}

}
