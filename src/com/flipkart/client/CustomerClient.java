package com.flipkart.client;

import com.flipkart.business.CustomerBusinessClass;

public class CustomerClient {
    public static void main(String[] args) {
        CustomerBusinessClass customerBusinessClass = new CustomerBusinessClass();

        customerBusinessClass.createCustomer();

        customerBusinessClass.listCustomer();
    }
}
