package com.autowiredemo;

public class Emp {

    private Address address;

    public Emp(Address address) {
        this.address = address;
    }

    public Emp()
    {
        super();
    }

    public Address getAddress() {
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
