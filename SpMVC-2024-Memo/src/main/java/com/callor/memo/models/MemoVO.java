package com.callor.memo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemoVO {

	private int m_seq;	//bigint
	private String m_author;	//varchar(25)
	private String m_date;	//varchar(10)
	private String m_time;	//varchar(10)
	private String m_title;
	private String m_memo;	//varchar(400)
	private String m_image;	//varchar(125)
}
