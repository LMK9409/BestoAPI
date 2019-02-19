package com.biz.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.biz.bestoapi.RankVO;

@Mapper
public interface BestoMapper {
	public ArrayList<RankVO> select();
}
