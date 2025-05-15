package com.mavenprojectdemo;

public class Customer {

    private String customer_name;
    private int customerId;
    private int  orderId;

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_name=" + customer_name +
                ", customerId=" + customerId +
                ", orderId=" + orderId +
                '}';
    }
}
