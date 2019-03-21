package com.procourier.model;

import java.util.Objects;

public final class Seller {

    private String name;
    private String description;
    private Address address;

    public Seller(String name, String description, Address address) {
        this.name = Objects.requireNonNull(name);
        this.description = description;
        this.address = Objects.requireNonNull(address);
    }

    public Seller(String name, Address address) {
        this(name,"",address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
