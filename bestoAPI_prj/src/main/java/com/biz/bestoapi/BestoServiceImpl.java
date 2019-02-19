package com.biz.bestoapi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.mapper.BestoMapper;


@Service
public  class BestoServiceImpl implements BestoService {
	
	@Autowired
	BestoMapper bestomapper;
	
	public ArrayList<RankVO> ranklist(){
		return bestomapper.select();
	}
//	@Autowired
//	BoardMapper boardMapper;
//	
//	public int svcAdminBoardInsert(BoardVO boardVO){
//		return boardMapper.binsert(boardVO);
//	}
//	public ArrayList<BoardVO> svcAdminBoardList(){
//		return boardMapper.select();
//	}
//	public ArrayList<BoardReplyVO> svcAdminReplyInsert(BoardReplyVO boardReplyVO) {
//		boardMapper.rinsert(boardReplyVO);
//		return boardMapper.rselect(boardReplyVO.getBseq());
//	}
//	
//	public BoardVO svcAdminBoardDetail(int bseq) {
//		return boardMapper.bdetail(bseq);
//	}
//	public ArrayList<BoardReplyVO> svcAdminReplySelect(int bseq) {
//		return boardMapper.rselect(bseq);
//	}

}
