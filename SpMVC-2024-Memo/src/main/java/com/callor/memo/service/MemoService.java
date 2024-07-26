package com.callor.memo.service;

import java.util.List;

import com.callor.memo.models.MemoVO;

public interface MemoService {

	public List<MemoVO> selectAll();
	public MemoVO findBySeq(int m_seq);
}
