package ajbc.testing.custometshirts;

public class Design {
	protected static final int MIN_WIDTH = 20;
	protected static final int MAX_WIDTH = 30;
	protected static final int MIN_HEIGTH = 10;
	protected static final int MAX_HEIGTH = 25;
	protected static final int MIN_COMPLEXITY = 1;
	protected static final int MAX_COMPLEXITY = 100;

	protected double width; // 20cm - 30cm
	protected double height; // 10cm - 25cm
	protected String slogan; // only digits and letters
	protected Color color;
	protected double complexity; // 1 - 100

	public Design() {
	}

	public Design(double width, double height, String slogan, Color color, double complexity) {
		setWidth(width);
		setHeight(height);
		setComplexity(complexity);
		this.slogan = slogan;
		this.color = color;
	}

	protected void setWidth(double width) {
		this.width = (width >= MIN_WIDTH && width <= MAX_WIDTH) ? width : MAX_WIDTH;
	}

	protected void setHeight(double height) {
		this.height = (height >= MIN_HEIGTH && height <= MAX_HEIGTH) ? height : MIN_HEIGTH;
	}

	protected void setComplexity(double complexity) {
		this.complexity = (complexity >= MIN_COMPLEXITY && complexity <= MAX_COMPLEXITY) ? complexity : MIN_COMPLEXITY;
	}
	
	public double getComplexity() {
		return complexity;
	}

	public double calculateArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Design [width=" + width + ", height=" + height + ", slogan=" + slogan + ", color=" + color
				+ ", complexity=" + complexity + "]";
	}
}
