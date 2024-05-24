package com.codes.e_store.entity;

import com.codes.e_store.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "users")
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ID;
    private String email;
    private String password;
    private String name;
    private UserRole role;
    @Lob
    @Column(columnDefinition="longblob")
    private byte[] img;

}
