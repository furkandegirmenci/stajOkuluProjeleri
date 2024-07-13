package com.stajokulu.stajokulu2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BalanceUnit {
    @Id
    @GeneratedValue
    private Long id;

    private String number;

    private String kind;

    private Double remainder;

    @ManyToOne
    @JoinColumn(name = "phoneNumber")
    private MobileLine mobileLine;

}
