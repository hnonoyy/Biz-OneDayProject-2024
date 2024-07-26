package com.callor.memo.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.callor.memo.models.MemoVO;

public interface MemoDao {

	@Select("SELECT * FROM tbl_memo ORDER BY m_seq")
	public List<MemoVO> selectAll();
	
	@Select("SELECT * FROM tbl_memo WHERE m_seq = #{m_seq}")
	public MemoVO findBySeq(int m_seq);
	
	@Select("SELECT * FORM tbl_memo WHERE m_title = #{m_title}")
	public List<MemoVO> findByTitle(String m_title);
	
	public int insert(MemoVO memoVO);
	public int update(MemoVO memoVO);
	
}
