package org.rasika.beancreationusingSI;

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
        University u = (University) context.getBean("university");
        System.out.println(u);
        
        Department department = (Department) context.getBean("department");
        System.out.println(department);
        
        Staff s = (Staff) context.getBean("staff");
        System.out.println(s);
        
        University u1 = (University) context.getBean("university1");
        System.out.println(u1);
        
        Teacher t = (Teacher) context.getBean("t1");
        System.out.println(t.getSubjectExpertTeacher());
        
        Staff staff = (Staff) context.getBean("staff1");
        System.out.println(staff.getAdminMap());
    }
}
