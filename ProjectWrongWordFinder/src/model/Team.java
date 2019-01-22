package model;

public class Team {
	
	private String teamId;
	private String teamName;
	private String teamCode;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(String teamId, String teamName, String teamCode) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamCode = teamCode;
	}
	@Override
	public String toString() {
		return "TeamId [teamId=" + teamId + ", teamName=" + teamName + ", teamCode=" + teamCode + "]";
	}
	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamCode() {
		return teamCode;
	}
	public void setTeamCode(String teamCode) {
		this.teamCode = teamCode;
	}
	
	
	

}
