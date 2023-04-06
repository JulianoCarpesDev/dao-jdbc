package application;

import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		SellerDao sellerDao = DaoFactory.crateSellerDao(); 
		
		Seller seller = sellerDao.findById(1);
		
		System.out.println(seller);
	}

}
