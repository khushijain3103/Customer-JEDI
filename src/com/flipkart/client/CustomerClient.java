package com.flipkart.client;

import com.flipkart.business.CustomerBusinessClass;

import java.util.Scanner;

public class CustomerClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerBusinessClass customerBusinessClass = new CustomerBusinessClass();

        customerBusinessClass.createCustomer();

        customerBusinessClass.listCustomer();

        System.out.println("Welcome to update Customer window");
        System.out.println("Enter customerID to update");
        int customerID = sc.nextInt();

        System.out.println("Enter customerName to update");
        String customerName = sc.next();

        System.out.println("Enter customerAddress to update");
        String customerAddress = sc.next();

        customerBusinessClass.updateCustomer(customerID , customerName , customerAddress);

        System.out.println("Enter customerID to delete");

        int customerIDToDelete = sc.nextInt();

        customerBusinessClass.deleteCustomer(customerIDToDelete);

        customerBusinessClass.listCustomer();
    }
}
