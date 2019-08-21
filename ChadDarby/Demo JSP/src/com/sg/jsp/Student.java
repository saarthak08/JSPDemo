package com.sg.jsp;


public class Student {
    private String firstName;
    private String secondName;
    private boolean goldCustomer;

    public Student(String firstName, String secondName, boolean goldCustomer) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.goldCustomer = goldCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isGoldCustomer() {
        return goldCustomer;
    }

    public void setGoldCustomer(boolean goldCustomer) {
        this.goldCustomer = goldCustomer;
    }
}
