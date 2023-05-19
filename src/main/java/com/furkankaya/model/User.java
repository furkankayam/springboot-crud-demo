package com.furkankaya.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;

    @Column(name = "first_name",nullable = false,length = 100, unique = true)
    private String firstName;

    @Column(name = "last_name",nullable = false,length = 100)
    private String lastName;

    @Column(name = "email",nullable = false,length = 100)
    private String email;

}
