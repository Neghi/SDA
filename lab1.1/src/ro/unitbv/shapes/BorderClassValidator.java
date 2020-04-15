package ro.unitbv.shapes;



public class BorderClassValidator {
	Boolean validate(int borderWidth) {
		Boolean ok = true;

		if (borderWidth < 0) {
			ok = false;
			throw new IllegalArgumentException("Marginea nu poate fi mai mica decat  0");
		}

		return ok;
	}

}