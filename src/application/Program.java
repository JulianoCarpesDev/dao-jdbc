package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// IMPLEMETACION DEPARTMENTDAO
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: findById =======");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);

		System.out.println("\n=== TEST 2: findAll =======");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}

		System.out.println("\n=== TEST 3: insert =======");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());

		System.out.println("\n=== TEST 4: update =======");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Food");
		departmentDao.update(dep2);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");

		sc.close();

		// IMPLETACION SELLERDAO
		/*
		 * SellerDao sellerDao = DaoFactory.crateSellerDao();
		 * 
		 * System.out.println("->->->Teste findById<-<-<-"); Seller seller =
		 * sellerDao.findById(1); System.out.println(seller);
		 * 
		 * System.out.println("->->->Teste findByDepartment<-<-<-"); Department
		 * department = new Department(3, null); List<Seller>list =
		 * sellerDao.findByDepartment(department); for (Seller s : list) {
		 * System.out.println(s); }
		 * 
		 * System.out.println("->->->Teste findByAll<-<-<-");
		 * 
		 * List<Seller>list2 = sellerDao.findAll(); for (Seller s : list2) {
		 * System.out.println(s); } System.out.println("->->->Teste insert<-<-<-");
		 * 
		 * Seller newSeller = new Seller(null, "Rafael","rafa.carpes@gmail.com" , new
		 * Date(), 2500.0, department);
		 * 
		 * sellerDao.insert(newSeller);
		 * 
		 * System.out.println("Inserted new Id = " + newSeller.getId()); seller =
		 * sellerDao.findById(1); seller.setName("Lucas Carpes");
		 * sellerDao.update(seller); System.out.println("Update user Success");
		 * 
		 * System.out.println("->->->Teste delete<-<-<-");
		 * 
		 * System.out.print("enter user id to delete: "); int id = sc.nextInt();
		 * sellerDao.deleteById(id);
		 * 
		 * System.out.println("User " + id +" has been successfully deleted");
		 * 
		 * sc.close();
		 */
	}

}
