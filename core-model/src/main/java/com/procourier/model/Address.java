package com.procourier.model;

import java.util.Objects;

public class Address {
    private String region;
    private String city;
    private String street;
    private String streetNumber;

    public Address(String region, String city, String street, String streetNumber) {
        this.region = Objects.requireNonNull(region);
        this.city = Objects.requireNonNull(city);
        this.street = Objects.requireNonNull(street);
        this.streetNumber = streetNumber;
    }

    public Address(String region, String city, String street) {
        this(region,city,street,"");
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }
}
