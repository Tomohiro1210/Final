package com.application.FamilySupporter.entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class User {
    private int id;
    private String name;
    private String password;
    private String mail;
    private Date registrationDate;

}
