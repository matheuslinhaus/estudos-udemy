package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class App {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

//			int x = 1;
//			if (x < 2) {
//				throw new SQLException("Fake");
//			}
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			conn.commit();

			System.out.println("Rows 1: " + rows1);
			System.out.println("Rows 2: " + rows2);
		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back:" + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Error trying to rollback" + e1.getMessage());
			}
		} finally {

		}
	}

}
