package org.hello.service;
import java.util.ArrayList;
import java.util.List;

import org.hello.api.HelloService;
import org.hello.dao.HelloDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;


@Service(version="1.0.0",protocol="dubbo")
public class HelloServiceImpl implements HelloService {
	@Autowired
	private HelloDao helloDao;
	
	public List<String> hello() {
		List<String> result = new ArrayList<String>();
		result.add("hello world!");
		result.addAll(helloDao.getData());
		return result;
	}
}
