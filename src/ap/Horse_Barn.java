package ap;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Horse_Barn {

	// 1. read question #3 here:
	// http://apcentral.collegeboard.com/apc/public/repository/ap_frq_computerscience_12.pdf
	// 2. try to solve part (a) on paper

	// 3. make this test pass
	@Test
	public void testHorseObject() throws Exception {
		Horse horse = new Horse("Trigger", 1340);
		assertEquals("Trigger", horse.getName());
		assertEquals(1340, horse.getWeight());
	}

	@Test
	public void testSetUpSpaces() throws Exception {
		// 4. create and initialize HorseBarn object
		// 5. initialize spaces as in AP exam page 14
		// 5.5 set the spaces array in the horseBarn object
		// 6. extract the last 3 steps into a method called "createTestBarn()"
		// 7. make the following asserts pass
		HorseBarn horseBarn = new HorseBarn();
		Horse[] horsey = new Horse[7];
		horsey[0] = new Horse("Trigger", 1340);
		horsey[1] = null;
		horsey[2] = new Horse("Silver", 1210);
		horsey[3] = new Horse("Lady", 1575);
		horsey[4] = null;
		horsey[5] = new Horse("Patches", 1350);
		horsey[6] = new Horse("Duke", 1410);
		horseBarn.setSpaces(horsey);

		assertEquals("Trigger", horseBarn.getSpaces()[0].getName());
		assertEquals("Silver", horseBarn.getSpaces()[2].getName());
		assertEquals("Lady", horseBarn.getSpaces()[3].getName());
		assertEquals("Patches", horseBarn.getSpaces()[5].getName());
		assertEquals("Duke", horseBarn.getSpaces()[6].getName());
	}

	@Test
	public void testPartA() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		assertEquals(0, horseBarn.findHorseSpace("Trigger"));// 0 A horse named
																// Trigger is in
																// space 0.
		assertEquals(2, horseBarn.findHorseSpace("Silver")); // 2 A horse named
																// Silver is in
																// space 2.
		assertEquals(-1, horseBarn.findHorseSpace("Coco"));// -1 A horse named
															// Coco is not inthe
															// barn
	}

	// 8. try to solve part (b) on paper

	@Test
	public void testPartB() throws Exception {
		HorseBarn horseBarn = HorseBarn.createTestBarn();
		// 9. set up the barn
		horseBarn.consolidate();
		// 10. write asserts that verify that the barn was consolidated (see
		// page 16)
	}
}