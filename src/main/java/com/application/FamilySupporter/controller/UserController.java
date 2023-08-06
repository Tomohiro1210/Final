package com.application.FamilySupporter.controller;

import com.application.FamilySupporter.controller.response.UserResponse;
import com.application.FamilySupporter.entity.User;
import com.application.FamilySupporter.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponse> users(){
        List<User> users = userService.findAll();
        List<UserResponse> response = users.stream().map(user -> new UserResponse(user.getId(), user.getName())).toList();
        return response;
    }

}
