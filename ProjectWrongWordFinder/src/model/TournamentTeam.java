package model;

public class TournamentTeam {

	private String teamId;
	private String teamName;
	private String teamCode;
	private String captain;
	private String viceCaptain;
	private String coach;
	private String manager;
	private String playersTable;

	// private String
	// private String
	public TournamentTeam() {
		super();
	}

	public TournamentTeam(String teamId, String teamName, String teamCode, String captain, String viceCaptain,
			String coach, String manager, String playersTable) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamCode = teamCode;
		this.captain = captain;
		this.viceCaptain = viceCaptain;
		this.coach = coach;
		this.manager = manager;
		this.playersTable = playersTable;
	}

	@Override
	public String toString() {
		return "TournamentTeam [teamId=" + teamId + ", teamName=" + teamName + ", teamCode=" + teamCode + ", captain="
				+ captain + ", viceCaptain=" + viceCaptain + ", coach=" + coach + ", manager=" + manager
				+ ", playersTable=" + playersTable + "]";
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

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getViceCaptain() {
		return viceCaptain;
	}

	public void setViceCaptain(String viceCaptain) {
		this.viceCaptain = viceCaptain;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getPlayersTable() {
		return playersTable;
	}

	public void setPlayersTable(String playersTable) {
		this.playersTable = playersTable;
	}

	

	

}
