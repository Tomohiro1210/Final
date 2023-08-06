package com.application.FamilySupporter.controller.response;

import com.application.FamilySupporter.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserResponse {

    private int id;
    private String name;

}
