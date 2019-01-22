package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.PlayerB;

public class SqliteHandler {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	private String DB_NAME = null;
	private String TABLE_NAME = null;

	public SqliteHandler() {
		this.DB_NAME = "default.db";
		this.TABLE_NAME = "defaulttable";
	}
	
	public SqliteHandler(String DB_NAME) {
		super();
		this.DB_NAME = DB_NAME;
		this.TABLE_NAME = "defaulttable";
	}

	public void openDatabase(String dB_NAME) {
		DB_NAME = dB_NAME;

		try {
			Class.forName("org.sqlite.JDBC");

			con = DriverManager.getConnection("jdbc:sqlite:" + DB_NAME);

			con.setAutoCommit(false);
			System.out.println(DB_NAME + " database successfully opened");

			stmt = con.createStatement();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(DB_NAME + " Database didn't open");
			e.printStackTrace();
		}

	}

	public ResultSet runQuery(String sql) throws SQLException {

		// sql = "select table_name from user_tables";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.err.println(sql+ " execute failed");
			e.printStackTrace();
			throw new SQLException();
		}
		return rs;

	}
	
	
//	public ResultSet getTable(String tableName) {
//
//		String sql = null;
//
//		sql = "SELECT * FROM " + tableName;
//		
//		try {
//
//			rs = stmt.executeQuery(sql);
//
//		} catch (Exception e) {
//			System.err.println(e.getClass().getName() + ": " + e.getMessage());
//			// System.exit(0);
//			System.err.println(tableName + " Operation getTableAsResultSet failed");
//		}
//		return rs;
//
//	}
	
	

	public ArrayList<PlayerB> getPlayers(String tableName) {

		ArrayList<PlayerB> al = new ArrayList<>();

		String sql = null;

		sql = "SELECT * FROM " + tableName;

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				// totalItem++;

				// Player item =

			}
			// System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(tableName + " Operation getPlayers failed");
		}

		return null;

	}

	public boolean isWord(String tableName, String s) {

		String sql = null;
		int totalItem = 0;
		boolean b=false;

		sql = "SELECT * FROM " + tableName;

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				totalItem++;
				
				String temp = rs.getString(2);
				
				if(s.equalsIgnoreCase(temp)){
					return true;
				}
				
				//System.out.println(temp);
				
//				if(totalItem>10){
//					break;
//				}
				

			}
			// System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(tableName + " Operation count failed");
		}

		return false;
	}
	public int getTotalItem(String tableName) {

		String sql = null;
		int totalItem = 0;

		sql = "SELECT * FROM " + tableName;

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				totalItem++;

			}
			// System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(tableName + " Operation count failed");
		}

		return totalItem;
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}

			if (stmt != null) {
				stmt.close();
			}

			// c.commit();
			if (con != null) {
				con.close();
			}

			System.out.println(DB_NAME + " database closed sucessfully");
		} catch (Exception e) {
			System.err.println(DB_NAME + " database didn't close sucessfully");
		}

	}

}
