package ro.unitbv.shapes;

public class DimensionValidator {

		Boolean validateSquare(int size) {

			Boolean ok = true;

			if (size < 0) {
				ok = false;
				throw new IllegalArgumentException("Mai mic ca 0 nu se poate");

			}

			return ok;
		}

		Boolean validateRectangle(int width, int height) {

			Boolean ok = true;

			if (width < 0 || height < 0) {
				ok = false;
				throw new IllegalArgumentException("Lungimea si latimea nu pot fi 0");

			}

			return ok;
		}

		Boolean validateCircle(int radius) {

			Boolean ok = true;
			if (radius < 0) {
				ok = false;
				throw new IllegalArgumentException("Raza nu poate fi 0");

			}

			return ok;
		}
	}