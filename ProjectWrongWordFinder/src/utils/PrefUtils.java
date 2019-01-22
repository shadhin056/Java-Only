package utils;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;


public class PrefUtils {

	static Preferences prefs = Preferences.userNodeForPackage(Context.class);

	
	//software
	public static String LAUNCH_COUNT = "LAUNCH_COUNT";
	public static String IS_FIRST_OPEN = "IS_FIRST_OPEN";
	
	
	//oracle
	public static String USER_NAME = "USER_ACCOUNT";
	public static String USER_PASS = "USER_PASS";
	public static String DRIVER_TYPE = "DRIVER_TYPE";
	public static String HOST = "HOST";
	public static String PORT = "PORT";
	public static String SID = "SID";
	
	
	//series details
	public static String TOURNAMENT_TITLE = "TOURNAMENT_TITLE";
	public static String TOURNAMENT_HOST = "TOURNAMENT_HOST";
	//public static String TOURNAMENT_TOTAL_TEAMS = "TOURNAMENT_TOTAL_TEAMS";
	public static String TOURNAMENT_MATCH_TYPE = "TOURNAMENT_MATCH_TYPE";
	
	
	public static String CURRENT_MATCH_ID = "CURRENT_MATCH_ID";
	public static String CURRENT_MATCH_OVER = "CURRENT_MATCH_OVER";
	
//	public static String CURRENET_BATTING = "CURRNET_BATTING";
//	public static String CURRENET_BOWLING = "CURRNET_BOWLING";
	
	public static String TEAM1_ID = "TEAM1_ID";
	public static String TEAM2_ID = "TEAM2_ID";	
	public static String TEAM1_NAME = "TEAM1_NAME";
	public static String TEAM2_NAME = "TEAM2_NAME";
	public static String TEAM1_CODE = "TEAM1_CODE";
	public static String TEAM2_CODE = "TEAM2_CODE";
	
	
	public static String INN1_BAT_TEAM_ID = "INN1_BAT_TEAM_ID";
	public static String INN1_BOWL_TEAM_ID = "INN1_BOWL_TEAM_ID";
	public static String INN2_BAT_TEAM_ID = "INN2_BAT_TEAM_ID";
	public static String INN2_BOWL_TEAM_ID = "INN2_BOWL_TEAM_ID";
	
	
	//BOOLEAN
	public static String LOCK_FIX = "LOCK_FIX";
	public static String LOCK_UNDO = "LOCK_UNDO";
	public static String LOCK_ADD_TEAM = "LOCK_UNDO";
	public static String LOCK_DELETE_TEAM = "LOCK_UNDO";

	
	
	

	
	
	

//	public static int getLaunchCount() {
//		return prefs.getInt(LAUNCH_COUNT, 0);
//	}
//
//	public static void incrementLaunchCounter() {
//
//		prefs.putInt(LAUNCH_COUNT, getLaunchCount() + 1);
//	}

	
	
	public static void clear(){
		try {
			prefs.clear();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static int getInt(String key, int def) {

		return prefs.getInt(key, def);
	}
	
	

	public static void putLong(String key, long value) {

		prefs.putLong(key, value);
	}

	public static long getLong(String key, long def) {

		return prefs.getLong(key, def);
	}

	public static void putInt(String key, int value) {

		prefs.putInt(key, value);
	}

	public static boolean getBoolean(String key, boolean def) {

		return prefs.getBoolean(key, def);
	}

	public static void putBoolean(String key, boolean value) {

		prefs.putBoolean(key, value);
	}

	public static String getString(String key, String def) {

		return prefs.get(key, def);
	}

	public static void putString(String key, String value) {

		prefs.put(key, value);
	}

	// System.out.println("count: "+n);

}
