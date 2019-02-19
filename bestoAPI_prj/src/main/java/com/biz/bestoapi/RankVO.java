package com.biz.bestoapi;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
@Scope("prototype")
public class RankVO {
	private int teamSeq;
	private int rank;
	private String team; 
	private int matchcount;
	private int winpoint;
	private int win;
	private int tie;
	private int loss;
	private int goalall;
	private float goalavg;
	private int lossall;
	private float lossavg;
	private int goaldifference;
	private String recent10games;
	public int getTeamSeq() {
		return teamSeq;
	}
	public void setTeamSeq(int teamSeq) {
		this.teamSeq = teamSeq;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getMatchcount() {
		return matchcount;
	}
	public void setMatchcount(int matchcount) {
		this.matchcount = matchcount;
	}
	public int getWinpoint() {
		return winpoint;
	}
	public void setWinpoint(int winpoint) {
		this.winpoint = winpoint;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getGoalall() {
		return goalall;
	}
	public void setGoalall(int goalall) {
		this.goalall = goalall;
	}
	public float getGoalavg() {
		return goalavg;
	}
	public void setGoalavg(float goalavg) {
		this.goalavg = goalavg;
	}
	public int getLossall() {
		return lossall;
	}
	public void setLossall(int lossall) {
		this.lossall = lossall;
	}
	public float getLossavg() {
		return lossavg;
	}
	public void setLossavg(float lossavg) {
		this.lossavg = lossavg;
	}
	public int getGoaldifference() {
		return goaldifference;
	}
	public void setGoaldifference(int goaldifference) {
		this.goaldifference = goaldifference;
	}
	public String getRecent10games() {
		return recent10games;
	}
	public void setRecent10games(String recent10games) {
		this.recent10games = recent10games;
	}
}
