package com.callor.memo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.memo.models.MemoVO;
import com.callor.memo.persistence.MemoDao;
import com.callor.memo.service.MemoService;

@Service
public class MemoServiceImplV1 implements MemoService {

	protected final MemoDao memoDao;
	
	public MemoServiceImplV1(MemoDao memoDao) {
		super();
		this.memoDao = memoDao;
	}

	@Override
	public List<MemoVO> selectAll() {
		List<MemoVO> memoList = memoDao.selectAll();
		return memoList;
	}

	@Override
	public MemoVO findBySeq(int m_seq) {
		MemoVO memoVO = memoDao.findBySeq(m_seq);
		return memoVO;
	}

}
