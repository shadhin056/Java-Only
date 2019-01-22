package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.DBItem;
import model.alltableElement;

public class SqliteMaker {

	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	private String DB_NAME = null;
	private String TABLE_NAME = null;
	private String ALL_TABLE = "alltable";

	// necessary data all talbe
	// private static String ALL_TABLE="alltable";
	private static int TABLE_NAME_COL_IND = 3;

	private String COL_0_TITLE = "_id"; // primary key
	private String COL_1_TITLE = "title"; // text
	private String COL_2_TITLE = "body"; // text
	private String COL_3_TITLE = "bookmark"; // int
	// private String COL_4_TITLE = ""; //

	// private String COL_0_TYPE = "INT";
	private String COL_1_TYPE = "TEXT";
	private String COL_2_TYPE = "TEXT";
	private String COL_3_TYPE = "INT";

	// private String COL_4_TYPE = "";

	public SqliteMaker() {
		this.DB_NAME = "default.db";
		this.TABLE_NAME = "defaulttable";
	}

	public SqliteMaker(String DB_NAME) {
		super();
		this.DB_NAME = DB_NAME;
		this.TABLE_NAME = "defaulttable";
	}

	public String getTABLE_NAME() {
		return TABLE_NAME;
	}

	public void setTABLE_NAME(String TABLE_NAME) {
		this.TABLE_NAME = TABLE_NAME;
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

	public void creatMetadata() {

		String creatTable = "CREATE TABLE " + "android_metadata"
				+ " (locale TEXT DEFAULT 'en_US')";
		String insetValue = "INSERT INTO " + "android_metadata"
				+ " VALUES ('en_US')";

		try {

			stmt.executeUpdate(creatTable);
			stmt.executeUpdate(insetValue);
			con.commit();

			System.out.println("Metadata created successfully");
			System.out.println("Please CommentOut Metadata function");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println("Metadata doesn't created");
		}
	}

	public void dropTable(String tableName) {
		// TODO Auto-generated method stub

		String sql = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

		try {
			stmt.executeUpdate(sql);
			con.commit();
			// System.out.println(tableName + " Droped");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void createTable(String tableName) {

		TABLE_NAME = tableName;
		String sql = null;

		// if table exist delete
		dropTable(tableName);

		// INT PRIMARY KEY
		// sql = "CREATE TABLE " + TABLE_NAME + " (_id INT PRIMARY KEY,"
		// + " e_title  	TEXT, " + " b_title    	TEXT, "
		// + " body        TEXT)";

		// INTEGER PRIMARY KEY
		sql = "CREATE TABLE " + TABLE_NAME + " (" + COL_0_TITLE
				+ " INTEGER PRIMARY KEY," + " " + COL_1_TITLE + "  	"
				+ COL_1_TYPE + ", " + " " + COL_2_TITLE + "    	" + COL_2_TYPE
				+ ", " + " " + COL_3_TITLE + "        " + COL_3_TYPE + ")";

		try {

			stmt.executeUpdate(sql);
			con.commit();

			System.out.println(TABLE_NAME + " Table created successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(TABLE_NAME + " Table doesn't created");
		}

	}

	public void insertData(String tableName, int id, String col_1_data,
			String col_2_data, int col_3_data) {

		TABLE_NAME = tableName;
		String sql = null;

		String arg = COL_0_TITLE + "," + COL_1_TITLE + "," + COL_2_TITLE + ","
				+ COL_3_TITLE;

		String value = id + ",'" + col_1_data + "','" + col_2_data + "',"
				+ col_3_data;

		// String value = id + "," + col_1_data + "," + col_2_data + ","
		// + col_3_data;

		sql = "INSERT INTO " + TABLE_NAME + " (" + arg + ") " + "VALUES ("
				+ value + ");";
		try {

			stmt.executeUpdate(sql);
			con.commit();

			// System.out.println("data insertion successfull");

		} catch (Exception e) {
			System.err.println("data insertion failed");
			System.err.println("----------------------");
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.err.println(id + " : " + col_1_data);
		}

	}

	public void updateData(String tableName, int id, String col_1_data,
			String col_2_data, int col_3_data) {

		TABLE_NAME = tableName;
		String sql = null;
		PreparedStatement preparedStatement = null;

		// dont miss it ''
		// sql = "UPDATE " + TABLE_NAME + " set title = 'title' where _id = 5;";

		// sql = "UPDATE " + TABLE_NAME + " set " + COL_1_TITLE + " = ?" + ","
		// + COL_2_TITLE + " = ?" + "," + COL_3_TITLE + " = ?"
		// + "where _id= ?;";

		sql = "UPDATE " + TABLE_NAME + " set " + COL_1_TITLE + " = '"
				+ col_1_data + "'," + COL_2_TITLE + " = '" + col_2_data + "',"
				+ COL_3_TITLE + " = '" + col_3_data + "' where _id= " + id
				+ " ;";

		try {

			// preparedStatement = con.prepareStatement(sql);
			//
			// preparedStatement.setString(1, col_1_data);
			// preparedStatement.setString(2, col_2_data);
			// preparedStatement.setInt(3, col_3_data);
			// preparedStatement.setInt(4, id);

			stmt.executeUpdate(sql);

			con.commit();

			System.out.println(TABLE_NAME + " Update done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(TABLE_NAME + " Update failed");
		}

	}

	// ---------------------------------------------------------
	// title making
	public void updateCol(String tableName, int id, String colName, String data) {

		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// id must be int primary key
		// otherwise will not work
		String sql = null;
		PreparedStatement preparedStatement = null;

		// dont miss it ''
		// sql = "UPDATE " + TABLE_NAME + " set title = 'title' where _id = 5;";

		// sql = "UPDATE " + TABLE_NAME + " set " + COL_1_TITLE + " = ?" + ","
		// + COL_2_TITLE + " = ?" + "," + COL_3_TITLE + " = ?"
		// + "where _id= ?;";

		sql = "UPDATE " + tableName + " set " + colName + " = '" + data
				+ "' where _id= " + id + " ;";

		// sql = "UPDATE " + tableName + " set body = 'title' where _id = 5;";

		try {

			// preparedStatement = con.prepareStatement(sql);
			//
			// preparedStatement.setString(1, col_1_data);
			// preparedStatement.setString(2, col_2_data);
			// preparedStatement.setInt(3, col_3_data);
			// preparedStatement.setInt(4, id);

			stmt.executeUpdate(sql);

			// con.commit();

			// System.out.println(tableName + " Update done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(tableName + " Update failed");
		}

	}

	public void updateTitleATable(String tableName, int colIndexTitle,
			String colNameTitle, int colIndexSource, String colNameSource) {

		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql = "SELECT * FROM " + tableName;

		int n = getTotalItem(tableName);
		System.out.println(n);

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id, totalItem;
				String source, title = null;

				id = rs.getInt(1);
				source = rs.getString(colIndexSource);
				//title = TextFiltering.getTitleFromText(source, 0, 65);

				// totalItem = rs.getInt(COL_3_TITLE);

				// data = MyEncryption.encrypt(data, keyValue);
				// System.out.println("id="+id);

				updateCol(tableName, id, colNameTitle, title);
				// updateData(tableName, id, col_title, "tests");

			}
			// System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err
					.println(tableName + " Operation titaling a table failed");
		}
	}

	public void titelingDatabase() {

		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String sql = "SELECT * FROM " + ALL_TABLE;

		int colIndexTitle=2;
		int colIndexSource=3;
		String colNameTitle = "title";
		String colNameSource = "body";
		
		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				// int id, totalItem;
				String tableName;

				// id = rs.getInt(0);
				tableName = rs.getString(TABLE_NAME_COL_IND);

				
				updateTitleATable(tableName, colIndexTitle, colNameTitle, colIndexSource, colNameSource);

				System.out.println(tableName + " Titled");

			}
			// System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(DB_NAME + " Operation Titeling database failed");
		}

	}

	public int getTotalItem(String tableName) {

		TABLE_NAME = tableName;
		String sql = null;
		int totalItem = 0;

		sql = "SELECT * FROM " + TABLE_NAME;

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

	public ArrayList<DBItem> getDBItem(String tableName, String sortingToken) {

		TABLE_NAME = tableName;
		String sql = null;
		ArrayList<DBItem> al = new ArrayList<DBItem>();

		if (sortingToken != null) {

			sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY " + sortingToken;

		} else {

			sql = "SELECT * FROM " + TABLE_NAME;

		}

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id, totalItem;
				String title, body;

				id = rs.getInt(COL_0_TITLE);
				title = rs.getString(COL_1_TITLE);
				body = rs.getString(COL_2_TITLE);
				// totalItem = rs.getInt(COL_3_TITLE);

				// title = MyEncryption.decrypt(title);
				// body = MyEncryption.decrypt(body);

				al.add(new DBItem(id, title, body, 0));

				// System.out.println(COL_0_TITLE + " = " + id);
				// System.out.println(COL_1_TITLE + " = " + title);
				// System.out.println(COL_2_TITLE + " = " + table_name);
				// System.out.println(COL_3_TITLE + " = " + totalItem);
				// System.out.println();

			}
			// System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(tableName + " Operation get table info failed");
		}
		return al;

	}

	public int getElementID(String tableName, String colTitle, String s) {

		TABLE_NAME = tableName;
		String sql = null;

		// sql = "SELECT * FROM " + TABLE_NAME + ";";

		sql = "SELECT _id FROM " + TABLE_NAME + " WHERE " + colTitle + " = '"
				+ s + "'";

		try {

			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				return rs.getInt(COL_0_TITLE);
			}

			// System.out.println("Operation get element id done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println("Operation get element id failed");
		}

		return -1;
	}

	public void creatATableForDatabaseInfo() {

		TABLE_NAME = ALL_TABLE;
		String sql = null;

		// if table exist delete
		dropTable(TABLE_NAME);

		String COL_0_TITLE = "_id"; // primary key
		String COL_1_TITLE = "title"; // text
		String COL_2_TITLE = "table_name"; // text
		String COL_3_TITLE = "total_item"; // int

		// private String COL_0_TYPE = "INT";
		String COL_1_TYPE = "TEXT";
		String COL_2_TYPE = "TEXT";
		String COL_3_TYPE = "INT";

		sql = "CREATE TABLE " + TABLE_NAME + " (" + COL_0_TITLE
				+ " INTEGER PRIMARY KEY," + " " + COL_1_TITLE + "  	"
				+ COL_1_TYPE + ", " + " " + COL_2_TITLE + "    	" + COL_2_TYPE
				+ ", " + " " + COL_3_TITLE + "        " + COL_3_TYPE + ")";

		try {

			stmt.executeUpdate(sql);
			con.commit();

			System.out.println(TABLE_NAME + " Table created successfully");
			System.out.println("");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(TABLE_NAME + " Table doesn't created");
		}

	}

	public void insertThisTableInfo(String title, String table_name,
			int total_item) {

		TABLE_NAME = ALL_TABLE;
		String sql = null;

		// String COL_0_TITLE = "_id"; // primary key
		String COL_1_TITLE = "title"; // text
		String COL_2_TITLE = "table_name"; // text
		String COL_3_TITLE = "total_item"; // int

		String arg = COL_0_TITLE + "," + COL_1_TITLE + "," + COL_2_TITLE + ","
				+ COL_3_TITLE;

		String value = "NULL" + ",'" + title + "','" + table_name + "',"
				+ total_item;

		sql = "INSERT INTO " + TABLE_NAME + " (" + arg + ") " + "VALUES ("
				+ value + ");";
		try {

			stmt.executeUpdate(sql);
			con.commit();

			// System.out.println("data insertion successfull");

		} catch (Exception e) {
			System.err.println("data insertion alltable failed");

		}

	}

	public void updateThisTableInfo(int id, String title, String table_name,
			int total_item) {

		TABLE_NAME = ALL_TABLE;
		String sql = null;
		// PreparedStatement preparedStatement = null;

		// String COL_0_TITLE = "_id"; // primary key
		String COL_1_TITLE = "title"; // text
		String COL_2_TITLE = "table_name"; // text
		String COL_3_TITLE = "total_item"; // int

		// dont miss it ''
		// sql = "UPDATE " + TABLE_NAME + " set title = 'title' where _id = 5;";

		// sql = "UPDATE " + TABLE_NAME + " set " + COL_1_TITLE + " = ?" + ","
		// + COL_2_TITLE + " = ?" + "," + COL_3_TITLE + " = ?"
		// + "where _id= ?;";

		sql = "UPDATE " + TABLE_NAME + " set " + COL_1_TITLE + " = '" + title
				+ "'," + COL_2_TITLE + " = '" + table_name + "'," + COL_3_TITLE
				+ " = '" + total_item + "' where _id= " + id + " ;";

		try {

			// preparedStatement = con.prepareStatement(sql);
			//
			// preparedStatement.setString(1, col_1_data);
			// preparedStatement.setString(2, col_2_data);
			// preparedStatement.setInt(3, col_3_data);
			// preparedStatement.setInt(4, id);

			stmt.executeUpdate(sql);

			con.commit();

			System.out.println(TABLE_NAME + " Update done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println(TABLE_NAME + " Update failed");
		}

	}

	public ArrayList<alltableElement> getAllTableDataSorted(String tableName,
			String sortingToken) {

		TABLE_NAME = tableName;
		String sql = null;
		ArrayList<alltableElement> al = new ArrayList<alltableElement>();

		// String COL_0_TITLE = "_id"; // primary key
		String COL_1_TITLE = "title"; // text
		String COL_2_TITLE = "table_name"; // text
		String COL_3_TITLE = "total_item"; // int

		if (sortingToken != null) {

			sql = "SELECT * FROM " + TABLE_NAME + " ORDER BY " + sortingToken;

		} else {

			sql = "SELECT * FROM " + TABLE_NAME;

		}

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id, totalItem;
				String title, table_name;

				id = rs.getInt(COL_0_TITLE);
				title = rs.getString(COL_1_TITLE);
				table_name = rs.getString(COL_2_TITLE);
				// totalItem = rs.getInt(COL_3_TITLE);

				// title = MyEncryption.decrypt(title);
				// body = MyEncryption.decrypt(body);

				al.add(new alltableElement(id, title, table_name, 0));

				// System.out.println(COL_0_TITLE + " = " + id);
				// System.out.println(COL_1_TITLE + " = " + title);
				// System.out.println(COL_2_TITLE + " = " + table_name);
				// System.out.println(COL_3_TITLE + " = " + totalItem);
				// System.out.println();

			}
			System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println("Operation get table info failed");
		}
		return al;

	}

	public void getAllData(String tableName) {

		TABLE_NAME = tableName;
		String sql = null;

		sql = "SELECT * FROM " + TABLE_NAME + ";";

		// System.out.println("aaffffff");

		try {

			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				int id, bookmark;
				String title, body;

				id = rs.getInt(COL_0_TITLE);
				title = rs.getString(COL_1_TITLE);
				body = rs.getString(COL_2_TITLE);
				bookmark = rs.getInt(COL_3_TITLE);

				// title = MyEncryption.decrypt(title);
				// body = MyEncryption.decrypt(body);

				System.out.println(COL_0_TITLE + " = " + id);
				System.out.println(COL_1_TITLE + " = " + title);
				System.out.println(COL_2_TITLE + " = " + body);
				System.out.println(COL_3_TITLE + " = " + bookmark);
				System.out.println();
			}
			System.out.println("Operation get done successfully");

		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			// System.exit(0);
			System.err.println("Operation get failed");
		}

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
