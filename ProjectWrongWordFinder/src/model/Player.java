package model;

public class Player {

	private String  playerId;
	private String firstName;
	private String lastName;
	private int bat;
	private int bowl;
	private int wk;
	private String teamId;

	public Player() {
		super();
	}

	public Player(String playerId, String firstName, String lastName, int bat, int bowl, int wk, String teamId) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bat = bat;
		this.bowl = bowl;
		this.wk = wk;
		this.teamId = teamId;
	}

	

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", firstName=" + firstName + ", lastName=" + lastName + ", bat=" + bat
				+ ", bowl=" + bowl + ", wk=" + wk + ", teamId=" + teamId + "]";
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBat() {
		return bat;
	}

	public void setBat(int bat) {
		this.bat = bat;
	}

	public int getBowl() {
		return bowl;
	}

	public void setBowl(int bowl) {
		this.bowl = bowl;
	}

	public int getWk() {
		return wk;
	}

	public void setWk(int wk) {
		this.wk = wk;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	
	
		

}
