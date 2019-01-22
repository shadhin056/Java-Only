package utils;

public class DataUtils {

	public static String DEFAULT_USER_NAME = "lab";
	public static String DEFAULT_USER_PASS = "cse301";
	public static String DEFAULT_HOST = "localhost";
	public static String DEFAULT_PORT = "1521";
	public static String DEFAULT_SID = "XE";
	public static String APP_LOGIN_USER_NAME = "admin";
	public static String APP_LOGIN_USER_PASS = "aaa";

	// public static String ORACLE_DATABASE_NAME = "aaa";
	public static String SQLITE_DB_NAME = "cric.db";
	
	public static String TABLE_TOURNAMENT_TEAMS = "tournament_team";
	public static String TABLE_PLAYERS = "player";
	public static String TABLE_INNINGS = "innings";
	public static String TABLE_TOSS = "toss";
	public static String TABLE_RESULT = "result";
	public static String TABLE_POINT = "point";
	public static String TABLE_MATCH = "match";
	
	public static String TABLE_ALL_CRIC_TEAMS = "all_cric_teams";
	public static String TABLE_SQUADS = "squads";
	public static String TABLE_MATCH_ODI = "match_odi";
	public static String TABLE_MATCH_T20 = "match_t20";
	public static String TABLE_MATCH_TEST = "match_test";
	
	
	public static String TABLE_SQUAD_PREFIX = "squad_";
	public static String TABLE_FINAL_SQUAD_PREFIX = "fsquad_";	//+match_id
	
	public static String TABLE_BATTING_INFIX = "_batting_";		//t20101_batting_ict109
	public static String TABLE_BOWLING_INFIX = "_bowling_";		//t20101_batting_ict109

	
	
	
	public static String VIEW_MATCH_ODI = "match_odi_lt";
	public static String VIEW_MATCH_T20 = "match_t20_lt";
	public static String VIEW_MATCH_TEST = "match_test_lt";
	

	// value day over
	public static int MAX_OVER_ODI = 50;
	public static int MIN_OVER_ODI = 20;
	public static int MAX_OVER_T20 = 20;
	public static int MIN_OVER_T20 = 10;
	
	
	public static int BOWL_PER_OVER = 6;
	public static int MAX_DAY_IN_TEST = 5;
	public static int MIN_DAY_IN_TEST = 3;
	
	public static String MATCH_ODI = "odi";
	public static String MATCH_T20 = "t20";
	public static String MATCH_TEST = "test";
	
	
	public static String TEAM1 = "TEAM1";
	public static String TEAM2 = "TEAM2";
	
	
	
	public static String FRAME_TITLE_PLAY_MATCH = "Play Match";
	public static String FRAME_TITLE_HOME = "Home";
	public static String FRAME_TITLE_ORACLE_BROWSER = "Oracle Browser";
	public static String FRAME_TITLE_ORACLE_PREF = "Oracle Preferences";
	public static String FRAME_TITLE_SQLITE_BROWSER = "Sqlite Brwoser";
	public static String FRAME_TITLE_ALL_TEAMS = "All Teams";
	public static String FRAME_TITLE_TOURNAMENT_TEAMS = "Tournament Teams";
	public static String FRAME_TITLE_TOURNAMENT_DETAILS = "Tournament Details";
	public static String FRAME_TITLE_TEAM_DETAILS = "Team Details";
	public static String FRAME_TITLE_MATCH_DETAILS = "Match Details";
	public static String FRAME_TITLE_TOSS = "Toss";
	public static String FRAME_TITLE_INITIALIZE = "Initialize";
	public static String FRAME_TITLE_FINAL_SQUAD = "Final Squad";
	public static String FRAME_TITLE_FIX_MATCH = "Fix Match";
	public static String FRAME_TITLE_LAUNCHER = "Login";
	public static String FRAME_TITLE_POINT_TALBE = "Point Table & Result";
	
	
	public static String[] COLIS_TOURNAMENT_TEAM = {"team_id","team_name","team_code"};
	
	
	
	
	
//	JRadioButton rbOk,rbNb,rbWd,rbDead;
//	JRadioButton rbBat,rbLb;
//	JSpinner spBatLb,spBye;
//	JCheckBox chbBye;
//	JRadioButton rbBowled,rbCatch,rbRunOut,rbStamping;
//	JButton btnSave,btnStrikeRotet,btnNewBall;
//	
//	public static String BALL_OK = "";
//	public static String BALL_NO= "";
//	public static String RUN_BAT = "";
//	public static String OK = "";
	

}
