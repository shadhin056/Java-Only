package model;

public class Match {
	
	private String matchId;
	private int matchNo ;
	private String team1;
	private String team2;
	private String date;
	private double over;
	private String matchType;
	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Match(String matchId, int matchNo, String team1, String team2, String date, double over, String matchType) {
		super();
		this.matchId = matchId;
		this.matchNo = matchNo;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.over = over;
		this.matchType = matchType;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", matchNo=" + matchNo + ", team1=" + team1 + ", team2=" + team2
				+ ", date=" + date + ", over=" + over + ", matchType=" + matchType + "]";
	}
	public String getMatchId() {
		return matchId;
	}
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}
	public int getMatchNo() {
		return matchNo;
	}
	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getOver() {
		return over;
	}
	public void setOver(double over) {
		this.over = over;
	}
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	
	

}
