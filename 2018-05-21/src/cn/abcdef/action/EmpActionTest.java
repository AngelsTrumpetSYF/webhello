package cn.abcdef.action;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class EmpActionTest {
	ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
	@Test
	public void testList() {
		EmployeeAction action = (EmployeeAction) ac.getBean("employeeAction");
		String result = action.list();
		System.out.println(result);
	}

}
