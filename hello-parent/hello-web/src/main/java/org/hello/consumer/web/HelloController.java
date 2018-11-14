package org.hello.consumer.web;

import java.util.List;

import org.hello.consumer.HelloBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
	
	@Autowired
	private HelloBusiness hellobusiness;
	
	@RequestMapping("/index")
	@ResponseBody
	public List<String> index(){
		return hellobusiness.hello();
	}

}
