package com.biz.bestoapi;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class VicVO {
	int matchSeq;
	Float victoryrateWin;
	Float victoryrateDraw;
	Float victoryrateLose;
	public int getMatchSeq() {
		return matchSeq;
	}
	public void setMatchSeq(int matchSeq) {
		this.matchSeq = matchSeq;
	}
	public Float getVictoryrateWin() {
		return victoryrateWin;
	}
	public void setVictoryrateWin(Float victoryrateWin) {
		this.victoryrateWin = victoryrateWin;
	}
	public Float getVictoryrateDraw() {
		return victoryrateDraw;
	}
	public void setVictoryrateDraw(Float victoryrateDraw) {
		this.victoryrateDraw = victoryrateDraw;
	}
	public Float getVictoryrateLose() {
		return victoryrateLose;
	}
	public void setVictoryrateLose(Float victoryrateLose) {
		this.victoryrateLose = victoryrateLose;
	}

	
}
