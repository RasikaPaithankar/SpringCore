package org.rasika.BeanInheritingDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Employee emp = (Employee)context.getBean("employee");
    	System.out.println(emp);
    	
    	Payment payment1 = (Payment) context.getBean("payment1");
    	System.out.println(payment1);
    	payment1.CalculateTotalSalary();
    	
    	Payment payment2 = (Payment) context.getBean("payment2");
    	System.out.println(payment2);
    	payment2.CalculateTotalSalary();
    }
}
