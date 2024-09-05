package com.flipkart.business;

import com.flipkart.bean.Customer;

public interface CustomerInterface {

    Customer customers[] = new Customer[3];

    public void createCustomer();

    public boolean updateCustomer(int customerID , String name , String address);

    public boolean deleteCustomer(int customerID);

    public void listCustomer();
}
