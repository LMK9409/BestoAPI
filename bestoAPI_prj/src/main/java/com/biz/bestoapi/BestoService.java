package com.biz.bestoapi;

import java.util.ArrayList;

public interface BestoService {
//	public int svcAdminBoardInsert(BoardVO boardVO);
//	public ArrayList<BoardReplyVO> svcAdminReplyInsert(BoardReplyVO boardReplyVO);
//	public ArrayList<BoardVO> svcAdminBoardList();
//	public BoardVO svcAdminBoardDetail(int bseq);
//	public ArrayList<BoardReplyVO> svcAdminReplySelect(int bseq);
	public ArrayList<RankVO> ranklist();
	public ArrayList<MatchVO> matchList();
	
	
}
