package com.springcore.auto.wire.automation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/automation/autoconfig.xml");

         Emp emp1= context.getBean("emp1",Emp.class);
         System.out.println(emp1);
	}

}
