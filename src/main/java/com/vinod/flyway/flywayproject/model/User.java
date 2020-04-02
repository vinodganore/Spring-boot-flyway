package com.vinod.flyway.flywayproject.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "REGISTRATION_USER")
public class User
{
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
}
