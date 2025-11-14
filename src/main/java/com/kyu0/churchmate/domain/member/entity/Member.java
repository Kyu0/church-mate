package com.kyu0.churchmate.domain.member.entity;

import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Table;

@Table("MEMBERS")
public class Member {
    @Id
    private UUID id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private String email;

    private UUID churchId;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
