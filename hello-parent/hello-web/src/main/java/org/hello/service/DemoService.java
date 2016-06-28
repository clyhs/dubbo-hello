package org.hello.service;
import java.util.List;

import org.hello.api.HelloService;
import org.springframework.stereotype.Service;
import com.alibaba.dubbo.config.annotation.Reference;

public class DemoService {
	
	private HelloService helloService;
	
	
	public HelloService getHelloService() {
		return helloService;
	}


	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}


	public List<String> hello(){
		return helloService.hello();
	}
}
