package com.adgon.junit.runners.enclosed;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@EqualsAndHashCode
@ToString
public class Address implements Serializable, Comparable<Address> {

    private static final long serialVersionUID = 1L;
    private final String address1;
    private final String city;
    private final String state;
    private final String zip;

    private Address(Builder builder) {
        this.address1 = builder.address1;
        this.city = builder.city;
        this.state = builder.state;
        this.zip = builder.zip;
    }

    public String getAddress1() {
        return address1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public int compareTo(Address that) {
        int result = this.zip.compareTo(that.zip);
        if (result == 0) {
            result = state.compareTo(that.state);
            if (result == 0) {
                result = city.compareTo(city);
                if (result == 0) {
                    return address1.compareTo(address1);
                }
            }
        }
        return result;
    }

    public static class Builder {

        private String address1;
        private String city;
        private String state;
        private String zip;

        public Builder address1(String address1) {
            this.address1 = address1;
            return this;
        }

        public Address build() {
            return new Address(this);
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder zip(String zip) {
            this.zip = zip;
            return this;
        }
    }
}