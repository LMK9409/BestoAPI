package com.biz.bestoapi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MatchVO {
	
	
	
	private int matchSeq;
	private String matchStarttime;
	private String matchHometeam;
	private String matchAwayteam;
	private String matchStadium;
	private String matchStatus;
	private VicVO vicVO;
	private RecVO recVO;
	
	
	
	
	public VicVO getVicVO() {
		return vicVO;
	}
	public void setVicVO(VicVO vicVO) {
		this.vicVO = vicVO;
	}
	public int getMatchSeq() {
		return matchSeq;
	}
	public void setMatchSeq(int matchSeq) {
		this.matchSeq = matchSeq;
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
	public RecVO getRecVO() {
		return recVO;
	}
	public void setRecVO(RecVO recVO) {
		this.recVO = recVO;
	}
	
}
