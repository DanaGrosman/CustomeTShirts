package ajbc.testing.custometshirts;

public class Tshirt {
	public static enum Size {
		XS, S, M, L, XL;
	}

	protected static final double MIN_DEMAND_FACTOR = 0.1;
	protected static final double MAX_DEMAND_FACTOR = 1;
	protected static final double MIN_BASE_PRICE = 3;
	protected static final double MAX_FINAL_PRICE = 10000;

	protected Size size;
	protected Design design;
	protected double demandFactor; // 0.1 - 1 , Default value 0.1
	protected double basePrice; // min 3, Default value 3
	protected double finalPrice;

	public Tshirt() {
	}

	public Tshirt(Size size, Design design, double demandFactor, double basePrice) {
		setBasePrice(basePrice);
		setDemandFactor(demandFactor);
		this.size = size;
		this.design = design;
		calculateFinalPrice();
	}

	protected void setBasePrice(double basePrice) {
		this.basePrice = basePrice < MIN_BASE_PRICE ? MIN_BASE_PRICE : basePrice;
	}

	protected void setDemandFactor(double demandFactor) {
		this.demandFactor = (demandFactor >= MIN_DEMAND_FACTOR && demandFactor <= MAX_DEMAND_FACTOR) ? demandFactor
				: MIN_DEMAND_FACTOR;
	}

	public void calculateFinalPrice() {
		finalPrice = (basePrice + design.getComplexity()) * (design.calculateArea() / demandFactor);
	}

	public boolean isExpensive() {
		return finalPrice >= MAX_FINAL_PRICE ? true : false;
	}

	@Override
	public String toString() {
		return "Tshirt [size=" + size + ", design=" + design + ", demandFactor=" + demandFactor + ", basePrice="
				+ basePrice + ", finalPrice=" + finalPrice + "]";
	}
}
