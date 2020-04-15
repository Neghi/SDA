package ro.unitbv.shapes;

public class HexColorValidator {
	Boolean validate(String colorHex) {

		Boolean ok = true;

		if (colorHex.charAt(0) != '#') {
			ok = false;
			throw new IllegalArgumentException("NU este hex color");

		}

		if (colorHex.length() > 7) {
			ok = false;
			throw new IllegalArgumentException("Numarul caracterelor din Hex color trebuie sa fie 7");

		}

		int i = 1;
		while (i < 7)

		{
			if (colorHex.charAt(i) < 'a' && colorHex.charAt(i) < '0'
					|| colorHex.charAt(i) > 'f' && colorHex.charAt(i) > '9') {
				ok = false;
				throw new IllegalArgumentException("caractere Hex color trebuie sa fie intre a-f si 0-9");
			}

			i++;

		}

		return ok;

	}
}