package utils;

import java.sql.Timestamp;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tools {

	public static void pToast(String s) {
		Toast mToast = new Toast(s, 1000);
		mToast.setVisible(true);
	}

	public static void pToast(String s, int sec) {
		Toast mToast = new Toast(s, sec * 1000);
		mToast.setVisible(true);
	}

	public static void printMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public static void printMessage(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.PLAIN_MESSAGE);
	}

	public static void printMessage2(String message, String title) {
		JOptionPane.showMessageDialog(null, new JTextArea(message), title, JOptionPane.PLAIN_MESSAGE);
	}

	public static boolean confirmDialog(String message, String title) {
		// int n = JOptionPane.showMessageDialog(null, message, title,
		// JOptionPane.YES_NO_OPTION);
		int n = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);

		if (n == JOptionPane.YES_OPTION) {
			return true;
		} else {
			return false;
		}

	}

	public static String getStringFromInputBox(String title) {
		String s = JOptionPane.showInputDialog(null, title);
		return s;
	}

	public static String valString(String s) {

		if (s == null) {
			return "null";
		}
		s = s.trim();

		// if(s.length()<1){
		// return "";
		// }

		return s;

	}

	public static String valString(String s, int l) {

		if (s == null) {
			return "null";
		}
		s = s.trim();

		if (s.length() < l) {
			return "x " + l;
		}

		return s;

	}

	public static boolean isOverValid(String matchType, double over) {

		if (matchType.equalsIgnoreCase(DataUtils.MATCH_ODI)) {
			if (over < DataUtils.MIN_OVER_ODI || over > DataUtils.MAX_OVER_ODI) {
				return false;
			}
		}

		if (matchType.equalsIgnoreCase(DataUtils.MATCH_T20)) {
			if (over < DataUtils.MIN_OVER_T20 || over > DataUtils.MAX_OVER_T20) {
				return false;
			}
		}

		// if(matchType.equalsIgnoreCase(DataUtils.MATCH_ODI)){
		// if (over < DataUtils.MIN_OVER_ODI || over > DataUtils.MAX_OVER_ODI) {
		// return false;
		// }
		// }

		return true;

	}

	public static String getTableNameFromMatchType(String matchType) {
		// TODO Auto-generated method stub
		String tableName = null;

		if (matchType.equalsIgnoreCase(DataUtils.MATCH_ODI)) {
			tableName = DataUtils.TABLE_MATCH_ODI;
		} else if (matchType.equalsIgnoreCase(DataUtils.MATCH_T20)) {
			tableName = DataUtils.TABLE_MATCH_T20;
		} else if (matchType.equalsIgnoreCase(DataUtils.MATCH_TEST)) {
			tableName = DataUtils.TABLE_MATCH_TEST;
		}

		tableName = DataUtils.TABLE_MATCH;
		
		return tableName;
	}

	public static String getMatchTypeFromMatchId(String matchId) {
		// TODO Auto-generated method stub
		String matchType = null;

		if (matchId.startsWith("odi") || matchId.startsWith("ODI")) {
			matchType = DataUtils.MATCH_ODI;
		} else if (matchId.startsWith("test") || matchId.startsWith("TEST")) {
			matchType = DataUtils.MATCH_TEST;
		} else if (matchId.startsWith("t20") || matchId.startsWith("T20")) {
			matchType = DataUtils.MATCH_T20;
		}

		return matchType;
	}

	public static int getOverFromMatchType(String matchType) {
		// TODO Auto-generated method stub

		int over = 0;

		if (matchType.equalsIgnoreCase(DataUtils.MATCH_ODI)) {
			over = DataUtils.MAX_OVER_ODI;
		} else if (matchType.equalsIgnoreCase(DataUtils.MATCH_T20)) {
			over = DataUtils.MAX_OVER_T20;
		} else if (matchType.equalsIgnoreCase(DataUtils.MATCH_TEST)) {
			over = 90;
		}

		return over;
	}

	public static String getMatchDetailsFromPref() {

		String matchInfo = PrefUtils.getString(PrefUtils.CURRENT_MATCH_ID, "") + " | "
				+ PrefUtils.getString(PrefUtils.TEAM1_ID, "") + " " + PrefUtils.getString(PrefUtils.TEAM1_NAME, "")
				+ " " + PrefUtils.getString(PrefUtils.TEAM1_CODE, "") + " | "
				+ PrefUtils.getString(PrefUtils.TEAM2_ID, "") + " " + PrefUtils.getString(PrefUtils.TEAM2_NAME, "")
				+ " " + PrefUtils.getString(PrefUtils.TEAM2_CODE, "");

		return matchInfo;
	}

	public static String getInningsTableFromPref() {

		String tableBatting1 = PrefUtils.getString(PrefUtils.CURRENT_MATCH_ID, "") + DataUtils.TABLE_BATTING_INFIX
				+ PrefUtils.getString(PrefUtils.INN1_BAT_TEAM_ID, "");
		String tableBowling1 = PrefUtils.getString(PrefUtils.CURRENT_MATCH_ID, "") + DataUtils.TABLE_BOWLING_INFIX
				+ PrefUtils.getString(PrefUtils.INN1_BOWL_TEAM_ID, "");

		String tableBatting2 = PrefUtils.getString(PrefUtils.CURRENT_MATCH_ID, "") + DataUtils.TABLE_BATTING_INFIX
				+ PrefUtils.getString(PrefUtils.INN2_BAT_TEAM_ID, "");
		String tableBowling2 = PrefUtils.getString(PrefUtils.CURRENT_MATCH_ID, "") + DataUtils.TABLE_BOWLING_INFIX
				+ PrefUtils.getString(PrefUtils.INN2_BOWL_TEAM_ID, "");

		String s = "Inn1Bat: " + tableBatting1 + "\nInn1Bowl: " + tableBowling1 + "\nInn2Bat: " + tableBatting2
				+ "\nInn2Bowl: " + tableBowling2;

		return s;
	}

	public static String getInningsDetailsFromPref() {

		String tableBatting1 = PrefUtils.getString(PrefUtils.INN1_BAT_TEAM_ID, "");
		String tableBowling1 = PrefUtils.getString(PrefUtils.INN1_BOWL_TEAM_ID, "");

		String tableBatting2 = PrefUtils.getString(PrefUtils.INN2_BAT_TEAM_ID, "");
		String tableBowling2 = PrefUtils.getString(PrefUtils.INN2_BOWL_TEAM_ID, "");

		String s = "Inn1Bat: " + tableBatting1 + "\nInn1Bowl: " + tableBowling1 + "\nInn2Bat: " + tableBatting2
				+ "\nInn2Bowl: " + tableBowling2;

		return s;
	}
	public static String getInningsDetails(String bat1, String bowl1, String bat2, String bowl2) {
		
		
		String s = "Inn1Bat: " + bat1 + "\nInn1Bowl: " + bowl1 + "\nInn2Bat: " + bat2
				+ "\nInn2Bowl: " + bowl2;
		
		return s;
	}
	

	public static String makeFileNameFromCurrentTime() {

		String ts = new Timestamp(System.currentTimeMillis()).toString();
		ts = ts.replace(':', '_');
		ts = ts.replace('-', '_');
		ts = ts.replace(' ', '_');
		System.out.println(ts);
		String fileName = "Report_" + ts + ".pdf";
		return fileName;

	}
	
	public static String getTeamBatting(String winTeam, String looseTeam, String choose, int innNo){
		
		String bat = null,bowl=null;
		if(innNo==1){
			if(choose.equalsIgnoreCase("bat")){
				bat= winTeam;
				bowl = looseTeam;
			}else{
				bat=looseTeam;
				bowl=winTeam;
			}
		}
		
		if(innNo==2){
			if(choose.equalsIgnoreCase("bat")){
				bat= looseTeam;
				bowl = winTeam;
			}else{
				bat=winTeam;
				bowl=looseTeam;
			}
		}
		
		return bat;
		//return bowl;
	
		
	}
	public static String getTeamBowling(String winTeam, String looseTeam, String choose, int innNo){
		
		String bat = null,bowl=null;
		if(innNo==1){
			if(choose.equalsIgnoreCase("bat")){
				bat= winTeam;
				bowl = looseTeam;
			}else{
				bat=looseTeam;
				bowl=winTeam;
			}
		}
		
		if(innNo==2){
			if(choose.equalsIgnoreCase("bat")){
				bat= looseTeam;
				bowl = winTeam;
			}else{
				bat=winTeam;
				bowl=looseTeam;
			}
		}
		
		//return bat;
		return bowl;
		
		
	}

}
