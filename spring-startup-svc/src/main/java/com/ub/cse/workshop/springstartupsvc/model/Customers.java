package com.ub.cse.workshop.springstartupsvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
    private int custid;
    private String custname;
    private String coursename;

    @Autowired
    Technologies technologies;

    public void display()
    {
        System.out.println("Object Returned Successfully");
        technologies.tech();
    }

    public int getCustid() {
        return custid;
    }
    public void setCustid(int custid) {
        this.custid = custid;
    }
    public String getCustname() {
        return custname;
    }
    public void setCustname(String custname) {
        this.custname = custname;
    }
    public String getCoursename() {
        return coursename;
    }
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}