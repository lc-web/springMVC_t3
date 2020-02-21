package com.accp.springMVC_t2.Action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.springMVC_t2.Biz.flightInfoBiz;

@Controller
@RequestMapping("/c/flightInfo")
public class fligthinfoAction {
@Autowired
private flightInfoBiz flight;

@PostMapping("list")
public String flightInfoByid(Model model,String flightId) {
	System.out.println("第一次提交");
	System.out.println("第二次提交");
	model.addAttribute("user",flight.queryById(flightId));
//	if(flightId=="") {
//		return "NewFile2";
//	}else {
//		return "NewFile1";
//	}
	System.out.println("123");
	return "";
	
}

}
