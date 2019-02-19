package com.biz.bestoapi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VsVO {
	
	private String homeTeam;
	private String homeSeasonrecord; //시즌성적
	private String homeMatchhistory; //맞대결전적
	private String homeRecentrecord; //최근 맞대결전적
	private String homeGoalandloss; //득점/실점
	private String homeGoalavg;		//평균득점/득실차
	
	private String awayTeam;
	private String awaySeasonrecord; //시즌성적
	private String awayMatchhistory; //맞대결전적
	private String awayRecentrecord; //최근 맞대결전적
	private String awayGoalandloss; //득점/실점
	private String awayGoalavg;		//평균득점/득실차
	
	private String season;
	
	public String getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	public String getHomeSeasonrecord() {
		return homeSeasonrecord;
	}
	public void setHomeSeasonrecord(String homeSeasonrecord) {
		this.homeSeasonrecord = homeSeasonrecord;
	}
	public String getHomeMatchhistory() {
		return homeMatchhistory;
	}
	public void setHomeMatchhistory(String homeMatchhistory) {
		this.homeMatchhistory = homeMatchhistory;
	}
	public String getHomeRecentrecord() {
		return homeRecentrecord;
	}
	public void setHomeRecentrecord(String homeRecentrecord) {
		this.homeRecentrecord = homeRecentrecord;
	}
	public String getHomeGoalandloss() {
		return homeGoalandloss;
	}
	public void setHomeGoalandloss(String homeGoalandloss) {
		this.homeGoalandloss = homeGoalandloss;
	}
	public String getHomeGoalavg() {
		return homeGoalavg;
	}
	public void setHomeGoalavg(String homeGoalavg) {
		this.homeGoalavg = homeGoalavg;
	}
	public String getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	public String getAwaySeasonrecord() {
		return awaySeasonrecord;
	}
	public void setAwaySeasonrecord(String awaySeasonrecord) {
		this.awaySeasonrecord = awaySeasonrecord;
	}
	public String getAwayMatchhistory() {
		return awayMatchhistory;
	}
	public void setAwayMatchhistory(String awayMatchhistory) {
		this.awayMatchhistory = awayMatchhistory;
	}
	public String getAwayRecentrecord() {
		return awayRecentrecord;
	}
	public void setAwayRecentrecord(String awayRecentrecord) {
		this.awayRecentrecord = awayRecentrecord;
	}
	public String getAwayGoalandloss() {
		return awayGoalandloss;
	}
	public void setAwayGoalandloss(String awayGoalandloss) {
		this.awayGoalandloss = awayGoalandloss;
	}
	public String getAwayGoalavg() {
		return awayGoalavg;
	}
	public void setAwayGoalavg(String awayGoalavg) {
		this.awayGoalavg = awayGoalavg;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	
	
	
}
