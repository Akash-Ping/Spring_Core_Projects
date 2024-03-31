package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

//        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        Ye indirectly resources ka child hai

        Car car1 = applicationContext.getBean(Car.class);
        car1.drive();

//        Car car2 = applicationContext.getBean(Car.class);
//        car2.drive();

       //to check for singleton (Bean Scope)
//        System.out.println(car1.hashCode());
//        System.out.println(car2.hashCode());
//        Car car = factory.getBean(Car.class);
//        car.drive();
    }
}
