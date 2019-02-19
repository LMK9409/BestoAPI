package com.biz.bestoapi;

public class MatchVO {
	private int matchSeq;
	private int gameSeq;
	private String matchStarttime;
	private String matchHometeam;
	private String matchAwayteam;
	private String matchVsrecord;
	private String matchStadium;
	private String matchStatus;
	private int userSeq;
	private RankVO rankVO;
	private RecVO recVO;
	public int getMatchSeq() {
		return matchSeq;
	}
	public void setMatchSeq(int matchSeq) {
		this.matchSeq = matchSeq;
	}
	public int getGameSeq() {
		return gameSeq;
	}
	public void setGameSeq(int gameSeq) {
		this.gameSeq = gameSeq;
	}
	public String getMatchStarttime() {
		return matchStarttime;
	}
	public void setMatchStarttime(String matchStarttime) {
		this.matchStarttime = matchStarttime;
	}
	public String getMatchHometeam() {
		return matchHometeam;
	}
	public void setMatchHometeam(String matchHometeam) {
		this.matchHometeam = matchHometeam;
	}
	public String getMatchAwayteam() {
		return matchAwayteam;
	}
	public void setMatchAwayteam(String matchAwayteam) {
		this.matchAwayteam = matchAwayteam;
	}
	public String getMatchVsrecord() {
		return matchVsrecord;
	}
	public void setMatchVsrecord(String matchVsrecord) {
		this.matchVsrecord = matchVsrecord;
	}
	public String getMatchStadium() {
		return matchStadium;
	}
	public void setMatchStadium(String matchStadium) {
		this.matchStadium = matchStadium;
	}
	public String getMatchStatus() {
		return matchStatus;
	}
	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	public RankVO getRankVO() {
		return rankVO;
	}
	public void setRankVO(RankVO rankVO) {
		this.rankVO = rankVO;
	}
	public RecVO getRecVO() {
		return recVO;
	}
	public void setRecVO(RecVO recVO) {
		this.recVO = recVO;
	}
	
}
