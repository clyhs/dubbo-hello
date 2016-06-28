package org.hello.web;

import java.util.List;

import org.hello.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/index")
	@ResponseBody
	public List<String> index(){
		return demoService.hello();
	}

}
