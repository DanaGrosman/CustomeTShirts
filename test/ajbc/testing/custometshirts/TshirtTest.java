package ajbc.testing.custometshirts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ajbc.testing.custometshirts.Tshirt.Size;

class TshirtTest {

	Tshirt tshirt = new Tshirt();

	@Test
	void checkFieldValues() {
		assertEquals(Size.M, tshirt.size);
		assertEquals(new Design(), tshirt.design);
		assertEquals(0.1, tshirt.demandFactor);
		assertEquals(3, tshirt.basePrice);
	}

	@Test
	void checkSetSize() {
		tshirt.setSize(Size.S);
		assertEquals(Size.S, tshirt.size);
	}

	@Test
	void checkSetDemandFactor() {
		tshirt.setDemandFactor(0.6);
		assertEquals(0.6, tshirt.demandFactor);
	}

	@Test
	void checkSetBasePrice() {
		tshirt.setBasePrice(5);
		assertEquals(5, tshirt.basePrice);
	}

	@Test
	void checkIsExpensive() {
		assertEquals(tshirt.finalPrice > 10000, tshirt.isExpensive());
	}

	@Test
	void checkFinalPriceCalc() {
		double finalPriceToCheck = (tshirt.basePrice + tshirt.design.getComplexity())
				* (tshirt.design.calculateArea() / tshirt.demandFactor);
		assertEquals(finalPriceToCheck, tshirt.finalPrice);
	}
}
