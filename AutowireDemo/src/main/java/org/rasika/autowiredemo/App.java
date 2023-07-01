package org.rasika.autowiredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AutoWire
 * 
 * 1. byName ->
 * 		- The byName mode injects the object dependency according to name of the bean.
 * 		- In such case, property name and bean name must be same.
 * 		- It internally calls setter method.
 * 
 * 		- if passing List<State> then, byName throws an error state is already defined if we define twice 
 * 		  so byName can not store List.
 * 
 * 2. byType ->
 * 		- The byType mode injects the object dependency according to type.
 * 		- so property name and bean name can be different.
 * 		- It internally calls setter method.
 * 
 * 		- for List<State>, and if we have multiple xml tags for state then it treats as a List and don not throw
 * 		  an error.
 *
 * 3. constructor ->
 * 		- The constructor mode injects the dependency by calling the constructor of the class.
 * 		- spring container injects the dependency by highest parameterized constructor.
 * 		- It calls the constructor having large number of parameters.
 * 		
 * 		- consider default constructor of injecting bean 
 * 		  eg., district is injected in State class so default constructor of district getting called for bean creation
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Territory territory = (Territory) context.getBean("territory");
        System.out.println(territory);
        
        Country country = (Country) context.getBean("country");
        System.out.println(country);
        
        District district = (District) context.getBean("district");
        System.out.println(district);
        
        State state4 = (State) context.getBean("state4");
        System.out.println("state4 " +state4);
        
        
        
        MobileFactory mobileFactory = (MobileFactory) context.getBean("mobiles");
        mobileFactory.getMobiles();
    }
}
