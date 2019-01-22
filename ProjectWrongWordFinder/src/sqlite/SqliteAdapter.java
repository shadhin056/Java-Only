package sqlite;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SqliteAdapter {
	
	private static SqliteHandler mSqliteReader;
	//private static String DB_NAME;
	
	public static void openDatabase(String dbName){
		
		mSqliteReader = new SqliteHandler();
		mSqliteReader.openDatabase(dbName);
	}
	
	public static ResultSet getResultSet(String sql, String dbName){
		
		openDatabase(dbName);
		ResultSet rs = null;
		try {
			rs = mSqliteReader.runQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
		return rs;
		
	}
	
	public static void close(){
		mSqliteReader.close();
	}
	

}
