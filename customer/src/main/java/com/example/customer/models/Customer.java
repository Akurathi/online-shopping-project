package com.example.customer.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private String email;
    private String first_name;
    private String last_name;

    protected Customer() { }

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() { return last_name; }

    public void setLast_name(String last_name) { this.last_name = last_name; }

    public void setEmail(String email) { this.email = email; }

    public void setFirst_name(String first_name) { this.first_name = first_name; }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
