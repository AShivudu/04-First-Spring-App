package com.shiva;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		BillCollector bean = context.getBean("billcollector", BillCollector.class);
		bean.collectPayment(140.00);
	}
}