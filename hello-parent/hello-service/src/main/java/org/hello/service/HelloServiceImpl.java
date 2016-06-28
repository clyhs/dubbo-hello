package org.hello.service;
import java.util.ArrayList;
import java.util.List;

import org.hello.api.HelloService;
import com.alibaba.dubbo.config.annotation.Service;

public class HelloServiceImpl implements HelloService {
	public List<String> hello() {
		List<String> result = new ArrayList<String>();
		result.add("hello world!");
		return result;
	}
}
