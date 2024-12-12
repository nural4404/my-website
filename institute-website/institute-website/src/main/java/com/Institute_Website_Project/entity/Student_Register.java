package com.Institute_Website_Project.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "user_register")
public class Student_Register {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String  firstName;

    private  String lastName;
    private String emailAddress;

    private String textMessage;
}
