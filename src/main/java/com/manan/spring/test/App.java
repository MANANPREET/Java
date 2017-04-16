package com.manan.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * 
 * @author Manan
 *
 */
public class App {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/manan/spring/test/beans/beans.xml");
	Person person = (Person) context.getBean("person");
	person.setTaxId(6666);
	Person person2 = (Person) context.getBean("person");
	Address address = (Address) context.getBean("address");
	person.speak();
	System.out.println(person2);
	System.out.println(address);
	((ClassPathXmlApplicationContext)context).close();
	}
}
