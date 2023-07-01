package org.rasika.LeadToSpring;

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
//    	Teacher obj = (Teacher) context.getBean("teacher");
//    	obj.toString();
    	
//    	School s = (School) context.getBean("school");
//    	s.toString();
//    	s.Attendant();
    	
    	Student stud = (Student) context.getBean("student");
    	stud.printStudentDetails(stud);
    	
    	Library l = (Library) context.getBean("library");
    	l.printLibraryDetails(l);
    	
    	Book book = (Book) context.getBean("book1");
    	System.out.println(book.getBookAuthorAndPrice());
    	
    	Publisher p = (Publisher) context.getBean("publisher");
    	System.out.println(p.getDetail());
    }
}
