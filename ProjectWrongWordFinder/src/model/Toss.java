package model;

public class Toss {

	public String matchId;
	public String tossWin;
	public String choose;

	public Toss(String matchId, String tossWin, String choose) {
		super();
		this.matchId = matchId;
		this.tossWin = tossWin;
		this.choose = choose;
	}

	@Override
	public String toString() {
		return "Toss [matchId=" + matchId + ", tossWin=" + tossWin + ", choose=" + choose + "]";
	}

	public String getMatchId() {
		return matchId;
	}

	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	public String getTossWin() {
		return tossWin;
	}

	public void setTossWin(String tossWin) {
		this.tossWin = tossWin;
	}

	public String getChoose() {
		return choose;
	}

	public void setChoose(String choose) {
		this.choose = choose;
	}

}
