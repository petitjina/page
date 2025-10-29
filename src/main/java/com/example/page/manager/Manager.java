package com.example.page.manager;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Manager {
   @Id
    private long userId;
    private String userName;
    private String phoneNumber;
    private String email;
    private String password;
}
