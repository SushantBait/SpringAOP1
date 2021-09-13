package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("com/springaop/config.xml");
      
      PaymentService paymentObject=context.getBean("payment",PaymentService.class);
      paymentObject.makePayment();   // join Point
    } 
}
