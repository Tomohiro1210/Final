package com.application.FamilySupporter.controller.response;

import com.application.FamilySupporter.entity.User;
import lombok.Getter;
import lombok.Setter;

public class UserResponse {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

}
