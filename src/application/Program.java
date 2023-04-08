package application;

import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		SellerDao sellerDao = DaoFactory.crateSellerDao(); 
		System.out.println("->->->Teste findById<-<-<-");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		System.out.println("->->->Teste findByDepartment<-<-<-");
		Department department = new Department(2, null);
		List<Seller>list = sellerDao.findByDepartment(department); 
		for (Seller s : list) {
			System.out.println(s);
		}
	}

}
