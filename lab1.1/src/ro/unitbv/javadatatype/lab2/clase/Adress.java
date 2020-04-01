package ro.unitbv.javadatatype.lab2.clase;

public class Adress {
	String strada;
	String oras;
	int numar;

	public Adress(String strada, String oras, int numar) {
		this.strada = strada;
		this.oras = oras;
		this.numar = numar;
	}

	@Override
	public String toString() {
		return "Adress{" + "strada=" + strada + ", oras=" + oras + ", numar=" + numar + '}';
	}

	public String getstreet() {
		return "strada: " + strada;
	}

	public String getcity() {
		return "oras:" + oras;
	}

	public String getnumber() {
		return "numar:" + numar;
	}

	public String getFullAdress() {
		return "strada:" + strada + " , oras:" + oras + " ,  numar:" + numar;
	}

}

