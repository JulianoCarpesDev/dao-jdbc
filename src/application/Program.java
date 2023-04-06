package application;

import java.util.Date;
import java.util.Locale;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Juliano","julianocarpes.dev@gmail.com",new Date(), 4500.0, obj);
		
		
		System.out.println(seller);
	}

}
