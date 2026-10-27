package com.vigileye.rescuehub_api.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // uses MySQL AUTO_INCREMENT
    private Long id;

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, unique = true, length = 150)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;           // stores the BCrypt hash, never the password

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false)
    private String address;

    private Double latitude;               // optional
    private Double longitude;              // optional

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist                            // runs just before the first insert
    void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
