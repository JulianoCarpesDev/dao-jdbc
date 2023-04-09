package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.crateSellerDao(); 
		
		System.out.println("->->->Teste findById<-<-<-");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);
		
		System.out.println("->->->Teste findByDepartment<-<-<-");
		Department department = new Department(3, null);
		List<Seller>list = sellerDao.findByDepartment(department); 
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("->->->Teste findByAll<-<-<-");
		
		List<Seller>list2 = sellerDao.findAll(); 
		for (Seller s : list2) {
			System.out.println(s);
		}
		System.out.println("->->->Teste insert<-<-<-");
		
		Seller newSeller = new Seller(null, "Rafael","rafa.carpes@gmail.com" , new Date(), 2500.0, department);
			
			sellerDao.insert(newSeller);
			
			System.out.println("Inserted new Id = " + newSeller.getId());
			seller = sellerDao.findById(1);
			seller.setName("Lucas Carpes");
			sellerDao.update(seller);
			System.out.println("Update user Success");
			
			System.out.println("->->->Teste delete<-<-<-");
			
			System.out.print("enter user id to delete: ");
			int id = sc.nextInt();
			sellerDao.deleteById(id);
			
			System.out.println("User " + id +" has been successfully deleted");
			
			sc.close();
	}

}
