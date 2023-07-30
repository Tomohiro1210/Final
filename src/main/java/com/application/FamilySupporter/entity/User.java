package com.application.FamilySupporter.entity;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private String password;
    private String mail;
    private Date registrationdate;

    public User(int id, String name, String password, String mail, Date registrationdate) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.registrationdate = registrationdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }
}
