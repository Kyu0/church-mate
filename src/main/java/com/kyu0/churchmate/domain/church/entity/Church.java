package com.kyu0.churchmate.domain.church.entity;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("CHURCHES")
public class Church {
    @Id
    private UUID id;
    private String name;
    private String address;
}
