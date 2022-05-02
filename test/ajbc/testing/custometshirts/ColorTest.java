package ajbc.testing.custometshirts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
class ColorTest {

	private Color[] colors = new Color[3];

	public ColorTest() {
		colors[0] = new Color((short) 0, (short) 0, (short) 0);
		colors[1] = new Color((short) 150, (short) 255, (short) 260);
		colors[2] = new Color((short) -100, (short) 122, (short) 200);
	}

	@Test
	void checkArrayIsNotNull() {
		assertNotNull(colors[0]);
		assertNotNull(colors[1]);
		assertNotNull(colors[2]);
	}

	@Test
	void checkObjectFields() {
		assertEquals(0, colors[0].red);
		assertEquals(0, colors[0].green);
		assertEquals(0, colors[0].blue);

		assertEquals(150, colors[1].red);
		assertEquals(255, colors[1].green);
		assertEquals(0, colors[1].blue);

		assertEquals(0, colors[2].red);
		assertEquals(122, colors[2].green);
		assertEquals(200, colors[2].blue);
	}

	@Test
	void checkDominantColors() {
		assertEquals("RED", colors[0].getDominant());
		assertEquals("GREEN", colors[1].getDominant());
		assertEquals("BLUE", colors[2].getDominant());
	}

	@Test
	void checkNormalizedColors() {
		assertEquals((float) 0 / 255, colors[0].normalized()[0]);
		assertEquals((float) 0 / 255, colors[0].normalized()[1]);
		assertEquals((float) 0 / 255, colors[0].normalized()[2]);

		assertEquals((float) 150 / 255, colors[1].normalized()[0]);
		assertEquals((float) 255 / 255, colors[1].normalized()[1]);
		assertEquals((float) 0 / 255, colors[1].normalized()[2]);

		assertEquals((float) 0 / 255, colors[2].normalized()[0]);
		assertEquals((float) 122 / 255, colors[2].normalized()[1]);
		assertEquals((float) 200 / 255, colors[2].normalized()[2]);
	}
	
	
}
