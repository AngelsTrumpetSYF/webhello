package cn.abcdef.action;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.abcdef.entity.Employee;

public class MyTest {
	public void t1() {
		HttpServletRequest servletRequest = ServletActionContext.getRequest();
		
		Map<String,Object> myMap = new HashMap<String,Object>();
		myMap.put("myEmp",new Employee());
		myMap.put("empName","abc");
		
		Set<String> keySet = myMap.keySet();
		for (String str : keySet) {
			servletRequest.setAttribute(str, myMap.get(str));
		}
	}
}
