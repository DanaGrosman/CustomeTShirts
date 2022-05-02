package ajbc.testing.custometshirts;

import java.util.Random;

import ajbc.testing.custometshirts.Tshirt.Size;

public class Runner {

	public static void main(String[] args) {
		Random randColor = new Random();
		Random rand = new Random();

		Tshirt[] tshirts = new Tshirt[3];

		for (int i = 0; i < tshirts.length; i++) {
			short red = (short) randColor.nextInt(255);
			short green = (short) randColor.nextInt(255);
			short blue = (short) randColor.nextInt(255);

			Color color = new Color(red, green, blue);
			Design design = new Design(rand.nextDouble(10) + 20, rand.nextDouble(15) + 10, "HIIII U", color,
					rand.nextDouble(100) + 1);

			tshirts[i] = new Tshirt(Size.S, design, rand.nextDouble(1) + 0.1, 3);
			System.out.println(tshirts[i]);
			System.out.println("isExpensive(): " + tshirts[i].isExpensive());
		}
	}
}
