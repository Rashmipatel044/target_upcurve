package com.springcore.expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/expression/exp_config.xml");
   Demo d1=  context.getBean("demo",Demo.class);
   System.out.println(d1);
   SpelExpressionParser temp= new SpelExpressionParser();
   Expression exp=temp.parseExpression("32+43");
   System.out.println(exp.getValue());
	}

}
