package org.hello.consumer;

import java.util.List;

import org.hello.api.HelloService;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;

@Service
public class HelloBusiness {
	
	@Reference(version="1.0.0")
	private HelloService helloService;



	public List<String> hello(){
		return helloService.hello();
	}

}
