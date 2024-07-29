package com.callor.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.memo.persistence.MemoDao;
import com.callor.memo.service.MemoService;

@Controller
@RequestMapping(value = "/memo")
public class MemoController {

	private final MemoDao memoDao;
	private final MemoService memoService;
	
	public MemoController(MemoDao memoDao, MemoService memoService) {
		super();
		this.memoDao = memoDao;
		this.memoService = memoService;
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return null;
	}
	
}
