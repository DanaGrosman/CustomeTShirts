package ajbc.testing.custometshirts;

public class Color {
	protected static final String RED = "RED";
	protected static final String GREEN = "GREEN";
	protected static final String BLUE = "BLUE";
	protected static final int NUM_OF_COLORS = 3;
	protected static final int MAX_RANGE = 255;
	protected static final int MIN_RANGE = 0;

	protected short red; // 0-255
	protected short green; // 0-255
	protected short blue; // 0-255

	public Color() {
	}
	
	public Color(short red, short green, short blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}

	protected void setRed(short red) {
		this.red = checkColor(red);
	}

	protected void setGreen(short green) {
		this.green = checkColor(green);
	}

	protected void setBlue(short blue) {
		this.blue = checkColor(blue);
	}

	private short checkColor(short color) {
		if (color >= MIN_RANGE && color <= MAX_RANGE)
			return color;
		else
			return MIN_RANGE;
	}

	public String getDominant() {
		if (red > green && red > blue)
			return RED;
		else if (green > red && green > blue)
			return GREEN;
		else
			return BLUE;
	}

	public float[] normalized() {
		float[] colorsNormalized = new float[NUM_OF_COLORS];
		colorsNormalized[0] = red / MAX_RANGE;
		colorsNormalized[1] = green / MAX_RANGE;
		colorsNormalized[2] = blue / MAX_RANGE;
		return colorsNormalized;
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
}
