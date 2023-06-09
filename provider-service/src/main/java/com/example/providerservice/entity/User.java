package com.example.providerservice.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(schema = "main", name = "usr")
public class User extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private OffsetDateTime birthDate;

    @Column(name = "password")
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    @JoinColumn(name = "account_id")
    private Account account;
}
