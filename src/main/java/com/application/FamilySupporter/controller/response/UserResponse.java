package com.application.FamilySupporter.controller.response;

import com.application.FamilySupporter.entity.User;

public class UserResponse {

    private int id;
    private String name;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
