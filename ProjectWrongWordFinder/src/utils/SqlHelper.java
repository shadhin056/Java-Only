package utils;

public class SqlHelper {

	private static String sql = null;

	public static String getSql() {

		return sql;
	}

	public static String createViewMatchLt(String viewName, String table1) {

		// viewName = "match_odi_lt";
		// table1 = "match_odi";

		String table2 = "all_cric_teams";

		sql = "create view " + viewName + " as "
				+ "select match_no, match_id, team1, team_name as team2,play_date from " + " ( "
				+ " select match_no, match_id, team_name as team1 ,team2, play_date from " + table1 + " join " + table2
				+ " on team1 = team_id " + " ) " + " join " + table2 + " on team2 = team_id " + " order by match_id ";

		return sql;
	}

	public static String createTable(String tableName) {

		// sql = "create table all_cric_teams(" + "team_id varchar(15) not
		// null,"
		// + "team_name varchar(15) not null," + "team_code varchar(15) not
		// null,"
		// + "PRIMARY KEY (team_id)" + ")";

		if (tableName.equals(DataUtils.TABLE_ALL_CRIC_TEAMS)) {

			// sql = "create table " + tableName + " (" + "team_id varchar(15)
			// not null,"
			// + "team_name varchar(15) not null," + "team_code varchar(15) not
			// null,"
			// + "PRIMARY KEY (team_id)" + ")";

		} else if (tableName.equals(DataUtils.TABLE_TOURNAMENT_TEAMS)) {

			// sql = "create table " + tableName + " (" + " team_id varchar(15)
			// not null,"
			// + " captain varchar(15)," + " vice_cap varchar(15)," + " coach
			// varchar(15),"
			// + " manager varchar(15)," + " pl_table varchar(15)," + " PRIMARY
			// KEY (team_id)" + ")";
			//

			sql = "create table " + tableName + " (" + "\nteam_id		varchar(15)		not null,"
					+ "\nteam_name	varchar(15)		not null," + "\nteam_code	varchar(15)		not null,"
					+ "\ncaptain		varchar(15)		default 'not declared',"
					+ "\nvice_cap	varchar(15)		default 'not declared',"
					+ "\ncoach		varchar(15)		default 'not declared',"
					+ "\nmanager		varchar(15)		default 'not declared'," + "\nPRIMARY KEY (team_id)" + "\n)";

		} else if (tableName.equals(DataUtils.TABLE_PLAYERS)) {

			// sql = "create table " + tableName + " (" + "player_id varchar(15)
			// not null,"
			// + "first_name varchar(15) not null," + "last_name varchar(15)," +
			// "bat number(1),"
			// + "bowl number(1)," + "wk number(1)," + "primary key(player_id)"
			// + ")";

			// sql = "create table " + tableName + " (" + "\nplayer_id
			// varchar(15) not null,"
			// + "\nfirst_name varchar(15) not null," + "\nlast_name
			// varchar(15),"
			// + "\nis_bat number(1)," + "\nis_bowl number(1)," + "\nis_wk
			// number(1),"
			// + "\nteam_id varchar(15) not null," + "\nprimary key(player_id)"
			// + "\n)";
			//
			sql = "create table " + tableName + " (" + "\nplayer_id 	varchar(15)		not null,"
					+ "\nfirst_name	varchar(15)		not null," + "\nlast_name 	varchar(15),"
					+ "\nis_bat 		number(1)," + "\nis_bowl 	number(1)," + "\nis_wk 		number(1),"
					+ "\nteam_id 	varchar(15)		not null," + "\nprimary key(player_id)," + "\nCONSTRAINTS fk_player"
					+ "\nFOREIGN KEY (team_id)" + "\nREFERENCES tournament_team (team_id)" + "\nON DELETE CASCADE"
					+ "\n)";

		} else if (tableName.equals(DataUtils.TABLE_SQUADS)) {

			// sql = "create table " + tableName + " (" + "player_id varchar(15)
			// not null,"
			// + "team_id varchar(15) not null," + "is_playing number(1),"
			// + "PRIMARY KEY (player_id)" + ")";

		} else if (tableName.equals(DataUtils.TABLE_INNINGS)) {

			// sql = "create table " + tableName + " (" + "\nmatch_id
			// varchar(15) not null,"
			// + "\ninn1_bat varchar(15)," + "\ninn1_bowl varchar(15)," +
			// "\ninn2_bat varchar(15),"
			// + "\ninn2_bowl varchar(15)," + "\nprimary key(match_id)" + "\n)";

			sql = "create table " + tableName + " (" + "\nmatch_id 	varchar(15)		not null,"
					+ "\ninn1_bat	varchar(15), " + "\ninn1_bowl	varchar(15), " + "\ninn2_bat	varchar(15), "
					+ "\ninn2_bowl	varchar(15)," + "\nprimary key(match_id)," + "\nCONSTRAINTS fk_innings"
					+ "\nFOREIGN KEY (match_id)" + "\nREFERENCES match (match_id)" + "\nON DELETE CASCADE" + "\n)";

		} else if (tableName.equals(DataUtils.TABLE_MATCH_ODI) || tableName.equals(DataUtils.TABLE_MATCH_T20)) {

			// sql = "create table " + tableName + " (" + "match_no number not
			// null,"
			// + "match_id varchar(15) not null," + "team1 varchar(15)," +
			// "team2 varchar(15),"
			// + "play_date date," + "over number(3,1)," + "PRIMARY KEY
			// (match_id)" + ")";

		} else if (tableName.equals(DataUtils.TABLE_MATCH)) {

			sql = "create table " + tableName + " (" + "\nmatch_no	number			not null,"
					+ "\nmatch_id	varchar(15)		not null," + "\nteam1		varchar(15),"
					+ "\nteam2		varchar(15)," + "\nplay_date	date," + "\ntype		varchar(15),"
					+ "\nover		number(5,1)," + "\nPRIMARY KEY (match_id)" + "\n)";

		} else if (tableName.equals(DataUtils.TABLE_TOSS)) {

			// sql = "create table " + tableName + " (" + "\nmatch_id
			// varchar(15) not null,"
			// + "\ntoss_win varchar(15), --team_id" + "\nchoose varchar(15),
			// --bat/bowl"
			// + "\nprimary key(match_id)" + "\n)";

			sql = "create table " + tableName + " (" + "\nmatch_id 	varchar(15)		not null,"
					+ "\ntoss_win	varchar(15), 	--team_id" + "\nchoose 		varchar(15), 	--bat/bowl"
					+ "\nprimary key(match_id)," + "\nCONSTRAINTS fk_toss" + "\nFOREIGN KEY (match_id)"
					+ "\nREFERENCES match (match_id)" + "\nON DELETE CASCADE" + "\n)";

		} else if (tableName.contains(DataUtils.TABLE_BATTING_INFIX)) {

			// sample t20101_batting_ict109
			// sample t20101_batting_ict104

			// sql = "create table " + tableName + " (" + "pos number not null,"
			// + "player_id varchar(15) not null," + "s0 number default 0,"
			// + "s1 number default 0," + "s2 number default 0,"
			// + "s3 number default 0," + "s4 number default 0,"
			// + "s6 number default 0," + "ball as (s0+s1+s2+s3+s4+s6),"
			// + "run as (s1+s2*2+s3*3+s4*4+s6*6),"
			// + "sr as
			// (round((s1+s2*2+s3*3+s4*4+s6*6)/(s0+s1+s2+s3+s4+s6+0.00001),2)),"
			// + "on_str number(1) default 0," + "is_out number(1) default 0,"
			// + "out_by varchar(15)," + "out_type varchar(15)," + "primary
			// key(player_id)" + ")";

			sql = "create table " + tableName + " (" + "\npos 		number		not null,"
					+ "\nplayer_id 	varchar(15)	not null," + "\ns0 			number 		default 0,"
					+ "\ns1 			number		default 0," + "\ns2 			number		default 0,"
					+ "\ns3 			number		default 0," + "\ns4 			number		default 0,"
					+ "\ns6 			number		default 0," + "\nball 		as (s0+s1+s2+s3+s4+s6),"
					+ "\nrun 		as (s1+s2*2+s3*3+s4*4+s6*6),"
					+ "\nsr 			as (round((s1+s2*2+s3*3+s4*4+s6*6)/(s0+s1+s2+s3+s4+s6+0.00001),2)),"
					+ "\non_str 		number(1)	default 0," + "\nis_out 		number(1)	default 0,"
					+ "\nout_by 		varchar(15)," + "\nout_type 	varchar(15)," + "\nprimary key(player_id)"
					+ "\n)";

		} else if (tableName.contains(DataUtils.TABLE_BOWLING_INFIX)) {

			// sql = "create table " + tableName + " (" + "pos number not null,"
			// + "player_id varchar(15) not null," + "s0 number default 0,"
			// + "s1 number default 0," + "s2 number default 0,"
			// + "s3 number default 0," + "s4 number default 0,"
			// + "s6 number default 0," + "wd number default 0,"
			// + "nb number default 0," + "lb number default 0,"
			// + "bye number default 0," + "over number default 0,"
			// + "cov_ball number default 0," + "wk number default 0,"
			// + "run as ((s1+s2*2+s3*3+s4*4+s6*6+wd+nb+lb+bye)),"
			// + "econ as
			// (round((s1+s2*2+s3*3+s4*4+s6*6+wd+nb+lb+bye)/(over*6+cov_ball+0.00001),2)),"
			// + "on_str number(1) default 0," + "primary key(player_id)" + ")";

			sql = "create table " + tableName + " (" + "\npos 		number		not null,"
					+ "\nplayer_id 	varchar(15)	not null," + "\ns0 			number 		default 0,"
					+ "\ns1 			number		default 0," + "\ns2 			number		default 0,"
					+ "\ns3 			number		default 0," + "\ns4 			number		default 0,"
					+ "\ns6 			number		default 0," + "\nwd 			number		default 0,"
					+ "\nnb 			number		default 0," + "\nlb 			number		default 0,"
					+ "\nbye			number		default 0," + "\nover 		number		default 0,"
					+ "\ncov_ball 	number		default 0," + "\nwk	 		number		default 0,"
					+ "\nrun 		as ((s1+s2*2+s3*3+s4*4+s6*6+wd+nb+lb+bye)),"
					+ "\necon 		as (round((s1+s2*2+s3*3+s4*4+s6*6+wd+nb+lb+bye)/(over*6+cov_ball+0.00001),2)),"
					+ "\non_str 		number(1)	default 0," + "\nprimary key(player_id)" + "\n)";

		} else if (tableName.equals(DataUtils.TABLE_RESULT)) {

			// sql = "create table " + tableName + " (" + "\nmatch_id
			// varchar(15) not null,"
			// + "\nwin_team varchar(15), --team_id" + "\nlose_team varchar(15),
			// --team_id"
			// + "\nprimary key(match_id)" + "\n)";
			//

			sql = "create table " + tableName + " (" + "\nmatch_id 	varchar(15)		not null,"
					+ "\nwin_team	varchar(15), 	--team_id" + "\nlose_team 	varchar(15), 	--team_id"
					+ "\nprimary key(match_id)," + "\nCONSTRAINTS fk_result" + "\nFOREIGN KEY (match_id)"
					+ "\nREFERENCES match (match_id)" + "\nON DELETE CASCADE" + "\n)";

		} else if (tableName.contains(DataUtils.TABLE_FINAL_SQUAD_PREFIX)) {

			// fsquad_match101

			sql = "create table " + tableName + " (" + "\nplayer_id		varchar(15)		not null,"
					+ "\nteam_id			varchar(15)		not null," + "\nPRIMARY KEY (player_id)" + "\n)";
		} else if (tableName.equals(DataUtils.TABLE_POINT)) {
			// sql = "create table " + tableName + " (" + "\nteam_id varchar(15)
			// not null,"
			// + "\nplay number default 0," + "\nwon number default 0,"
			// + "\nlost number default 0," + "\ndraw number default 0,"
			// + "\npoints as (won*3+draw*1)," + "\nPRIMARY KEY (team_id)" +
			// "\n)";

			sql = "create table " + tableName + " (" + "\nteam_id		varchar(15)		not null,"
					+ "\nplay		number			default 0," + "\nwon			number			default 0,"
					+ "\nlost		number			default 0," + "\ndraw		number			default 0,"
					+ "\npoints 		as (won*3+draw*1)," + "\nprimary key(team_id)," + "\nCONSTRAINTS fk_point"
					+ "\nFOREIGN KEY (team_id)" + "\nREFERENCES tournament_team (team_id)" + "\nON DELETE CASCADE"
					+ "\n)";
		}

		return sql;

	}

	public static String createTableSquadCode(String tableName) {

		sql = "create table " + tableName + " (" + "player_id		varchar(15)		not null,"
				+ "PRIMARY KEY (player_id)" + ")";

		return sql;

	}

	public static String insertValueByPs(String tableName, int n) {

		// sql = "insert into all_cric_teams values (?,?,?)";
		String q = "";

		for (int i = 0; i < n; i++) {

			if (i == 0) {
				q = q + "?";
				continue;
			}
			q = q + ",?";
		}

		sql = "insert into " + tableName + " values (" + q + ")";

		return sql;
	}

	public static String insertValueByColArg(String tableName, String[] col, String[] arg) {

		// sql = "insert into all_cric_teams values (?,?,?)";
		// String q = "";

		String colString = "";
		String argString = "";
		String sql = null;

		for (int i = 0; i < arg.length; i++) {
			if (i == arg.length - 1) {

				colString += col[i];
				argString += "'" + arg[i] + "'";
			} else {
				colString += col[i] + ",";
				argString += "'" + arg[i] + "'" + ",";
			}
		}
		sql = "insert into " + tableName + " (" + colString + ") " + " values (" + argString + ")";

		// = COL_0_TITLE + "," + COL_1_TITLE + "," + COL_2_TITLE + ","
		// + COL_3_TITLE;
		//
		// argString = id + ",'" + col_1_data + "','" + col_2_data + "',"
		// + col_3_data;

		// String value = id + "," + col_1_data + "," + col_2_data + ","
		// + col_3_data;

		// sql = "INSERT INTO " + TABLE_NAME + " (" + arg + ") " + "VALUES ("
		// + value + ");";
		//
		// for (int i = 0; i < n; i++) {
		//
		// if (i == 0) {
		// q = q + "?";
		// continue;
		// }
		// q = q + ",?";
		// }
		//
		// sql = "insert into " + tableName + colString + " values (" + q + ")";

		return sql;
	}

	public static String insertIntoAllCricTeams(String[] arr) {
		sql = "insert into all_cric_teams values ('" + arr[0] + "','" + arr[1] + "','" + arr[2] + "')";
		return sql;
	}

	public static String countTable(String tableName) {

		sql = "select count(*) as c from " + tableName;
		return sql;
	}

	public static String getATable(String tableName) {

		sql = "select * from " + tableName;
		return sql;
	}

	public static String getATable(String tableName, String oc) {

		if (oc != null) {
			sql = "select * from " + tableName + " order by " + oc;
		} else {
			sql = "select * from " + tableName;
		}

		return sql;
	}

	public static String getTuples(String tableName, String conCol, String conValue, String oc) {

		if (oc != null) {
			sql = "select * from " + tableName + " where " + conCol + " = '" + conValue + "'" + " order by " + oc;
		} else {
			sql = "select * from " + tableName + " where " + conCol + " = '" + conValue + "'";
			;
		}

		return sql;
	}

	public static String getACol(String tableName, String col) {

		sql = "select " + col + " from " + tableName + " order by " + col;
		return sql;
	}

	public static String getACell(String tableName, String col, String conCol, String conValue) {

		sql = "select " + col + " from " + tableName + " where " + conCol + " = '" + conValue + "'";
		return sql;
	}
	public static String getACell(String tableName, String col, String conCol, int conValue) {
		
		sql = "select " + col + " from " + tableName + " where " + conCol + " = " + conValue + "";
		return sql;
	}
	
	

	public static String getAMatchById(String matchId) {

		String matchType = Tools.getMatchTypeFromMatchId(matchId);
		String tableName = Tools.getTableNameFromMatchType(matchType);

		sql = "select * from " + tableName + " where match_id = '" + matchId + "'";
		return sql;
	}

	public static String getTeamNameById(String teamId) {

		sql = "select team_name from " + DataUtils.TABLE_TOURNAMENT_TEAMS + " where team_id = '" + teamId + "'";
		return sql;
	}

	public static String getTeamCodeById(String teamId) {

		sql = "select team_code from " + DataUtils.TABLE_TOURNAMENT_TEAMS + " where team_id = '" + teamId + "'";
		return sql;
	}

	public static String getTablesWithJoin(String table1, String table2, String col1, String col2) {

		sql = "select * from " + table1 + " join " + table2 + " on " + col1 + " = " + col2;
		return sql;
	}

	public static String getTournamentTeams(String oc) {

		if (oc != null) {
			sql = "select * from " + DataUtils.TABLE_TOURNAMENT_TEAMS + " order by " + oc;
		} else {
			sql = "select * from " + DataUtils.TABLE_TOURNAMENT_TEAMS;
		}

		return sql;
	}

	public static String getSquadsByTeam(String teamId, String oc) {

		if (oc != null) {
			sql = "select * from " + DataUtils.TABLE_PLAYERS + " where team_id = '" + teamId + "' order by " + oc;
		} else {
			sql = "select * from " + DataUtils.TABLE_PLAYERS + " where team_id = '" + teamId;
		}

		return sql;
	}

	public static String getSquadsByTeamLight(String teamId, String oc) {

		if (oc != null) {

			sql = "select player_id, first_name, last_name from " + DataUtils.TABLE_PLAYERS + " natural join "
					+ DataUtils.TABLE_SQUADS + " where team_id = '" + teamId + "' order by " + oc;

		} else {
			sql = "select player_id, first_name, last_name from " + DataUtils.TABLE_PLAYERS + " natural join "
					+ DataUtils.TABLE_SQUADS + " where team_id = '" + teamId + "'";
		}

		return sql;
	}

	public static String getFinalSquadByTeam(String tableName, String teamId, String oc) {

		if (oc != null) {

			sql = "select player_id, first_name, last_name from " + DataUtils.TABLE_PLAYERS + " natural join "
					+ tableName +  " where team_id = '" + teamId + "'" + " order by " + oc;

		} else {
			sql = "select player_id, first_name, last_name from " + DataUtils.TABLE_PLAYERS + " natural join "
					+ tableName +  " where team_id = '" + teamId + "'" ;
		}

		return sql;
	}
	
	public static String getFinalSquadByTeamLight(String tableName, String oc) {
		
		if (oc != null) {
			
			sql = "select player_id, first_name, last_name from " + DataUtils.TABLE_PLAYERS + " natural join "
					+ tableName + " order by " + oc;
			
		} else {
			sql = "select player_id, first_name, last_name from " + DataUtils.TABLE_PLAYERS + " natural join "
					+ tableName;
		}
		
		return sql;
	}

	public static String getAllUserTables() {
		sql = "select table_name from user_tables";
		return sql;
	}

	public static String dropTable(String tableName) {

		sql = "drop table " + tableName;
		return sql;
	}

	public static String updateTable(String tableName, String setCol, String setValue, String conCol, String conValue) {

		// sql = "delete from " + tableName + " where " + colName + " = '" +
		// value + "'";
		// update tournament_teams set coach = 'gadha' where team_id = 'ict109';
		sql = "update " + tableName + " set " + setCol + " = '" + setValue + "' where " + conCol + " = '" + conValue
				+ "'";

		return sql;
	}
	public static String updateTable(String tableName, String setCol, String setValue, String conCol, int conValue) {

		sql = "update " + tableName + " set " + setCol + " = '" + setValue + "' where " + conCol + " = " + conValue
				+ "";
		
		return sql;
	}

	public static String deleteAllTuples(String tableName) {

		sql = "delete from " + tableName;
		return sql;
	}

	public static String deleteTuple(String tableName, String conCol, String conValue) {

		sql = "delete from " + tableName + " where " + conCol + " = '" + conValue + "'";
		return sql;
	}

	public static String deleteTuple(String tableName, String conCol, int conValue) {

		sql = "delete from " + tableName + " where " + conCol + " = " + conValue + "";
		return sql;
	}

	public static String deleteTupleLike(String tableName, String conCol, String pattern) {

		sql = "delete from " + tableName + " where " + conCol + " like '" + pattern + "'";
		return sql;
	}

}
