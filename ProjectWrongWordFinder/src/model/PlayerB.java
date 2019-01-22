package model;

public class PlayerB {

	private String  playerId;
	private String firstName;
	private String lastName;
	private boolean bat;
	private boolean bowl;
	private boolean wk;
	private String teamId;

	public PlayerB() {
		super();
	}

	
	public PlayerB(String playerId, String firstName, String lastName, boolean bat, boolean bowl, boolean wk,
			String teamId) {
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

	public boolean isBat() {
		return bat;
	}

	public void setBat(boolean bat) {
		this.bat = bat;
	}

	public boolean isBowl() {
		return bowl;
	}

	public void setBowl(boolean bowl) {
		this.bowl = bowl;
	}

	public boolean isWk() {
		return wk;
	}

	public void setWk(boolean wk) {
		this.wk = wk;
	}

	public String getteamId() {
		return teamId;
	}

	public void setteamId(String teamId) {
		this.teamId = teamId;
	}

		

}
