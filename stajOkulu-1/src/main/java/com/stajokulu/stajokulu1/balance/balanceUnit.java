package com.stajokulu.stajokulu1.balance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class balanceUnit {
    @Id
    @GeneratedValue
    private Long id;

    private String number;

    private String kind;

    private Double remainder;
}
