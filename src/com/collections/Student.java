package com.collections;

public class Student {
    private int registrationNumber;
    private String name;
    private String phoneNumber;

    public Student(int registrationNumber, String name, String phoneNumber) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
