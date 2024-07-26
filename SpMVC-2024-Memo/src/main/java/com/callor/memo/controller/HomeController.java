package com.callor.memo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.memo.models.MemoVO;
import com.callor.memo.persistence.MemoDao;

@Controller
public class HomeController {

	private final MemoDao memoDao;

	public HomeController(MemoDao memoDao) {
		super();
		this.memoDao = memoDao;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(LocalDateTime localdate, Model model) {
		List<MemoVO> memoList = memoDao.selectAll();
		
		LocalDateTime currentDate = LocalDateTime.now();
		String nowDate = currentDate.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));
		String hour = String.valueOf(currentDate.getHour());
		String minute = String.valueOf(currentDate.getMinute());
		String second = String.valueOf(currentDate.getSecond());
		String auth = "hnono0210@gmail.com";
		
		String time = hour +":"+minute+":"+second;
		model.addAttribute("m_date", nowDate);
		model.addAttribute("m_time", time);
		model.addAttribute("m_author",auth);

		model.addAttribute("MEMO_LIST", memoList);
		return "home";

	}	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String home(Model model) {
		
		return "memo/input";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		return "memo/input";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(MemoVO memoVo, Model model) {
		model.addAttribute("memoVO", memoVo);
		int result = memoDao.insert(memoVo);
		return "redirect:/";
	}
}
