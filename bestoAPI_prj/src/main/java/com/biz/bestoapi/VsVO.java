package com.biz.bestoapi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VsVO {
	
	private String homeTeam;
	private String homeSeasonrecord; //������
	private String homeMatchhistory; //�´������
	private String homeRecentrecord; //�ֱ� �´������
	private String homeGoalandloss; //����/����
	private String homeGoalavg;		//��յ���/�����
	
	private String awayTeam;
	private String awaySeasonrecord; //������
	private String awayMatchhistory; //�´������
	private String awayRecentrecord; //�ֱ� �´������
	private String awayGoalandloss; //����/����
	private String awayGoalavg;		//��յ���/�����
	
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
