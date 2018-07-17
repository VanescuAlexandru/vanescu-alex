package exCap1;
//Turn the AllTheColorsOfTheRainbow example into a program that
//compiles and runs.



class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;

	void changeTheHueOfTheColor(int newHue) {
		newHue++;
			System.out.println(newHue);
	}

}

public class E11 {

	public static void main(String[] args) {

		AllTheColorsOfTheRainbow s = new AllTheColorsOfTheRainbow();
		System.out.println(s.anIntegerRepresentingColors);
			s.changeTheHueOfTheColor(s.anIntegerRepresentingColors);
		
	}

}
