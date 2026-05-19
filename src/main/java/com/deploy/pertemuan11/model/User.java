package com.deploy.pertemuan11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 11usages
@Data
@uilder
@Table(name = "users")
@ALlArgsConstructor
@NoArgsConstructor

public class User {
    @Id
    private String id;
    private String username;
    private String password;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;
