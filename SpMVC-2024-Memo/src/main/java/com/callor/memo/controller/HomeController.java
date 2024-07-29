package com.callor.memo.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.memo.models.MemoVO;
import com.callor.memo.persistence.MemoDao;
import com.callor.memo.service.MemoService;

@Controller
public class HomeController {

	private final MemoDao memoDao;
	private final MemoService memoService;
	

	public HomeController(MemoDao memoDao, MemoService memoService) {
		super();
		this.memoDao = memoDao;
		this.memoService = memoService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession httpSession) {
		List<MemoVO> memoList = memoService.selectAll();
		httpSession.setAttribute("MEMOLIST", memoList);
		return "home";
	}	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String insert(MemoVO memoVO) {
		memoVO.setM_author("hnono0210@gmail.com");
		LocalDateTime currentDate = LocalDateTime.now();
		String nowDate = currentDate.format(DateTimeFormatter.ofPattern("YYYY-MM-dd"));

		LocalTime nTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String nowTime = nTime.format(formatter);
		
		memoVO.setM_date(nowDate);
		memoVO.setM_time(nowTime);

		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(int m_seq, Model model) {
		MemoVO memoVO = memoDao.findBySeq(m_seq);
		model.addAttribute("MEMO" ,memoVO);
		return "memo/input";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(MemoVO memoVO, HttpSession httpSession) {
		
		int result = memoDao.update(memoVO);
				
		return "redirect:/";
	}
	
}
