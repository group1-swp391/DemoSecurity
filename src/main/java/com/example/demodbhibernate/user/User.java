package com.example.demodbhibernate.user;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
