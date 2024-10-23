package application;

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

	}

}
