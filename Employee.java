package com.vishal.springbootdemo.model;

public class Employee {

    private String id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public  String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }
    public String getEmailId(){
        return emailId;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
}
