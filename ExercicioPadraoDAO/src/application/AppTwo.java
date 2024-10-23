package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class AppTwo {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("Insert Department");
		Department dep = new Department(null, "Food");
		departmentDao.insert(dep);
		
		
		System.out.println("UPDATE DEPARTMENT");
		 dep = new Department(5, "iFood");
		departmentDao.update(dep);
		
		
		System.out.println("DELETE");
		departmentDao.deleteById(7);
		
		System.out.println("Get By ID");
		Department depFind = departmentDao.findById(1);
		System.out.println(depFind);
		
		
		System.out.println("Get");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		
		for(Department pd : list) {
			System.out.println(pd);
		}
		}

}
