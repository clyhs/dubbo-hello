/**
 * 
 */
package org.hello.service;

import java.util.ArrayList;
import java.util.List;

import org.hello.api.HelloService;

/**
 * @author chenly 
 *
 * @version createtime:2016-6-28 下午1:34:49 
 */
public class MyServiceImpl implements HelloService {
	public List<String> hello() {
		// TODO Auto-generated method stub
		List<String> result = new ArrayList<String>();
		result.add("hello tiancom.com!");
		return result;
	}
}
