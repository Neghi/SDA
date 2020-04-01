package ro.unitbv.javadatatype.lab2.clase;



public class Clase {

	public static void main(String[] args)

	{
		Adress adress1 = new Adress("Malu Rosu", "PLOIESTI", 30);
		PaymentMethod pm1 = new PaymentMethod("$$$");
		Customer customer = new Customer("Anton", "Panaitescu", 30, adress1, pm1);
		
		Adress adress = new Adress("Malu Rosu", "PLOIESTI", 7);
		PaymentMethod pm = new PaymentMethod("Card");
		System.out.println(customer);
		Customer customer1 = new Customer("Stefan", "Marius", 25, adress, pm);
	
		System.out.println(customer1);

		System.out.println(customer1.getPaymentMethod().gettype());
		System.out.println(customer1.getCompleteName());
		System.out.println(customer1.getAdress().getnumber());
		System.out.println(customer1.getAdress().getFullAdress());
		System.out.println(customer1.getAdress().getcity());
               System.out.println(customer1.getAdress());
	}

}