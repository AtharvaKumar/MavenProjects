package com.mavenprojectdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        ClassPathXmlApplicationContext context;
        context = new ClassPathXmlApplicationContext("config.xml");

        Customer customer1 = (Customer) context.getBean("customer1");
        System.out.println("customerId = " + customer1.getCustomerId());
        System.out.println("customer_name = " + customer1.getCustomer_name());
        System.out.println("orderId = " + customer1.getOrderId());

        Customer customer2 = (Customer) context.getBean("customer2");
        System.out.println("customerId = " + customer2.getCustomerId());
        System.out.println("customer_name = " + customer2.getCustomer_name());
        System.out.println("orderId = " + customer2.getOrderId());




    }
}