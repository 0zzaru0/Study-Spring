package com.hello.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.mvc.model.HelloBiz;

@Controller
public class HelloController {
	
	//05. Biz(@Service) 호출
	@Autowired
	private HelloBiz biz;
	
	//04.handler mapping 통해 controller의 메서드를 찾아
	@RequestMapping("/hello.do")
	public String getHello(Model model) {
		
		//09. return 받은 값을 model 객체에 담아서 전달 (ModelAndView)
		model.addAttribute("message", biz.getHello());
		// 전달할 view의 위치, 이름을 return한다.
		return "/WEB-INF/views/hello.jsp";
	}

	@RequestMapping("/bye.do")
	public ModelAndView getBye (@RequestParam("name") String nickname) {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("/WEB-INF/views/bye.jsp");
		mav.addObject("message", "Bye," + nickname);
		
		return mav;
	}
	
}