package com.example.addressservice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;

@Entity
@Table(name = "address")
@Setter
@Getter
public class Address  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    private String street;

    private String addressLine1;
    private String addressLine2;

    private Integer zipCode;

    private String state;

    private String houseNo;

    private String flatNo;

    private String country;

    private String sector;

    private String landmark;

}
