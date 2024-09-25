package com.springcore.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext com= new ClassPathXmlApplicationContext("com/springcore/stereotype/stero_config.xml");
          Student student1=com.getBean("ob",Student.class);
          System.out.println(student1);
          System.out.println(student1.getAddress());
          System.out.println(student1.getAddress().getClass().getName());
	}

}
