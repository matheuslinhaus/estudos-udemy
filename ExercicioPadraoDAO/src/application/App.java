package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class App {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Seller by Id");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);

	}

}
