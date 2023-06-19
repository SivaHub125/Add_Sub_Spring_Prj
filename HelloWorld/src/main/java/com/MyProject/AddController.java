package com.MyProject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController 
{
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request ,HttpServletResponse response)
	{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int k=i+j;
		int l=i-j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("resultadd",k);
		mv.addObject("resultsub",l);
		return mv;
	}

}
