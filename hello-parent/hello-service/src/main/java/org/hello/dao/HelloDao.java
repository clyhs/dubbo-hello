package org.hello.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDao {
	
	public List<String> getData(){
		List<String> lists = new ArrayList<String>();
		lists.add("tiancom");
		return lists;
	}

}
