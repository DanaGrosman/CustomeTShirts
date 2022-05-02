package ajbc.testing.custometshirts;

import java.util.Objects;

public class Color {
	private static final String RED = "RED";
	private static final String GREEN = "GREEN";
	private static final String BLUE = "BLUE";
	private static final short MAX_RANGE = 255;
	private static final short MIN_RANGE = 0;

	protected short red; // 0-255
	protected short green; // 0-255
	protected short blue; // 0-255

	public Color() {
		this(MIN_RANGE, MIN_RANGE, MIN_RANGE);
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
		double max = Math.max(red, Math.max(green, blue));
		if (max == red)
			return RED;
		return max == green ? GREEN : BLUE;
	}

	public float[] normalized() {
		return new float[] { (float) red / MAX_RANGE, (float) green / MAX_RANGE, (float) blue / MAX_RANGE };
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Color other = (Color) obj;
		return blue == other.blue && green == other.green && red == other.red;
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}
}
