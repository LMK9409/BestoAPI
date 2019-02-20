package com.biz.bestoapi;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
@Controller
public class MainController {

	@Autowired
	VsVO vsvo;
	
	@Autowired
	BestoService bestoService;

	@RequestMapping(value="/alist.do", method = RequestMethod.GET)
	public void rankList(HttpServletRequest request,HttpServletResponse response) {
		try {
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			Gson gson = new Gson();
			ArrayList<MatchVO> list = bestoService.matchList();
			String res=gson.toJson(list);
			System.out.println(res);
			response.setContentType("application/json; encoding=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value="/vs.do", method = RequestMethod.GET)
	public void recordcrawling(HttpServletRequest request,HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		ArrayList<String> vslist = new ArrayList<String>();
		
		String team1 = "4222";
		String team2 = "4080";
		
		String url = "http://www.betman.co.kr/sportsMatchRecord.so?method=inquireMatchRecord&item=SC&league=52&id=1&seq=&teamId1="+ team1 +"&teamId2="+ team2 +"&isToto=&viewType=recent";
		
		
		System.out.println(url);
		
			Document doc = Jsoup.connect(url).get();
			Elements element = doc.select("#resultTeams > div > div > div > div.dataH02WarpSet > div > table > tbody > tr");
			
			for(Element el : element.select("td")){
				vslist.add(el.text());
			}
			
			for(int i=0;i<vslist.size();i++) {
				if(i == 0) vsvo.setHomeTeam(vslist.get(i));
				else if(i == 4) vsvo.setAwayTeam(vslist.get(i));
				else if(i == 7) vsvo.setHomeSeasonrecord(vslist.get(i));
				else if(i == 8) vsvo.setSeason(vslist.get(i));
				else if(i == 9) vsvo.setAwaySeasonrecord(vslist.get(i));
				else if(i == 10) vsvo.setHomeRecentrecord(vslist.get(i));
				else if(i == 12) vsvo.setAwayRecentrecord(vslist.get(i));
				else if(i == 13) vsvo.setHomeMatchhistory(vslist.get(i));
				else if(i == 15) vsvo.setAwayMatchhistory(vslist.get(i));
				else if(i == 16) vsvo.setHomeGoalandloss(vslist.get(i));
				else if(i == 18) vsvo.setAwayGoalandloss(vslist.get(i));
				else if(i == 19) vsvo.setHomeGoalavg(vslist.get(i));
				else if(i == 21) vsvo.setAwayGoalavg(vslist.get(i));
			}
			
			String json = gson.toJson(vsvo);
			System.out.println(json);
			
			PrintWriter out = response.getWriter();
			response.setContentType("application/json; encoding=UTF-8");
			out.println(json);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/matchplan.do", method = RequestMethod.GET)
	public void matchplan(HttpServletRequest request,HttpServletResponse response) {
		try {
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			Gson gson = new Gson();
			ArrayList<RankVO> list = bestoService.ranklist();
			String res=gson.toJson(list);
			System.out.println(res);
			PrintWriter out = response.getWriter();
			
			
			out.println(res);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/rankinfo.do", method = RequestMethod.GET)
	public void rankinfo(HttpServletRequest request,HttpServletResponse response) {
		try {
			response.setCharacterEncoding("UTF-8");
			request.setCharacterEncoding("UTF-8");
			Gson gson = new Gson();
			ArrayList<RankVO> list = bestoService.ranklist();
			String res=gson.toJson(list);
			System.out.println(res);
			PrintWriter out = response.getWriter();
			out.println(res);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
