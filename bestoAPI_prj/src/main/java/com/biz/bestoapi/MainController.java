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
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

@Controller
public class MainController {


	@Autowired
	BestoService bestoService;

	@RequestMapping(value="/alist.do", method = RequestMethod.GET)
	public void rankList(HttpServletRequest request,HttpServletResponse response) {
		try {
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
