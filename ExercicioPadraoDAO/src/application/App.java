package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Seller by Id");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		System.out.println("Seller by Department");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller sl : list) {
			System.out.println(sl);
		}
		
		System.out.println("Seller All");
		list = sellerDao.findAll();
		for (Seller sl : list) {
			System.out.println(sl);
		}
		
		System.out.println("Seller Insert");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, dep);
		sellerDao.insert(newSeller);
		System.out.println("Seller insert new id: " + newSeller.getId());
		
		System.out.println("Seller UPDATE");
		seller = sellerDao.findById(9);
		seller.setName("Marta wanre");
		sellerDao.update(seller);

	}

}
