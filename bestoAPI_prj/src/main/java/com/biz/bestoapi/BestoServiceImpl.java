package com.biz.bestoapi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.mapper.BestoMapper;


@Service
public  class BestoServiceImpl implements BestoService {
	
	@Autowired
	BestoMapper bestomapper;
	
	
	@Override
	public ArrayList<RankVO> ranklist(){
		return bestomapper.select();
	}


	@Override
	public ArrayList<MatchVO> matchList() {
		// TODO Auto-generated method stub
		return bestomapper.matchList();
	}







}
