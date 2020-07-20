package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;




public class Client {

	private static ApplicationContext context;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Jot Watson");
		e.setEsalary(30000);
		
		System.out.println(e);
		
		
		
		// Inversion of Control (IOC)
		//1. Add jar Files for Spring Core
		//2. Configure Java Object in an XML File
		//3. User Spring IOC Container, eg:BeanFactory or ApplicationContext to get the object constructed by them
		
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		//Employee e1 = (Employee) factory.getBean("emp1");
		//Employee e2 = factory.getBean("emp2" ,Employee.class);
		
		
		context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee) context.getBean("emp1");
		
		//Employee e2 = context.getBean("emp2" ,Employee.class);
		
		
		System.out.println("----------------------Spring IOC In Action -----------------");
		
		
		System.out.println("Employee detail: " + e1);
		//System.out.println(e2);
	}

}
