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
@Table(name = "police_stations")
public class PoliceStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 150)
    private String name;

    @Column(nullable = false,unique = true,length = 150)
    private String email;

    @Column(nullable = false,name ="password_hash")
    private String passwordHash;

    @Column(nullable = false,length = 20)
    private String phone;

    @Column(nullable = false)
    private  String address;


    private Double latitude;               // optional
    private Double longitude;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist                            // runs just before the first insert
    void onCreate() {
        createdAt = LocalDateTime.now();
    }



}
