package com.annotationdemo;

import com.annotationdemo.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

    @Autowired
    private Address address;

    public Emp(com.annotationdemo.Address address) {
        this.address = address;
    }

    public Emp()
    {
        super();
    }

    public com.annotationdemo.Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}

