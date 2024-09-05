package com.flipkart.business;

import com.flipkart.bean.Customer;

public class CustomerBusinessClass {


    Customer customers[] = new Customer[3];

    public void createCustomer(){
        System.out.println("customer is created --> ");

        //-----------Record-1------------
        customers[0] = new Customer();
        customers[0].setCustomerID(101);
        customers[0].setCustomerName("khushi");
        customers[0].setCustomerAddress("abc");

        //----------Record-2---------------
        customers[1] = new Customer();
        customers[1].setCustomerID(102);
        customers[1].setCustomerName("vasu");
        customers[1].setCustomerAddress("abc");

        //---------Record-2------------
        customers[2] = new Customer();
        customers[2].setCustomerID(103);
        customers[2].setCustomerName("sanchit");
        customers[2].setCustomerAddress("abc");
    }

    public boolean updateCustomer(int customerID){
        System.out.println("customer is updated by ID --> " + customerID);
        return true;
    }

    public boolean deleteCustomer(int customerID){
        System.out.println("customer is deleted by ID --> " + customerID);
        return true;
    }

    public void listCustomer(){
        System.out.println(" list customer is printed --> ");

        for(Customer customer : customers){
            System.out.println("LIST OF THE CUSTOMERS " +
                    customer.getCustomerID() + " with " +
                    customer.getCustomerName() + " with " +
                    customer.getCustomerAddress());
        }

    }

}
