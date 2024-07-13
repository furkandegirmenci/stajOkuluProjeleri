package com.stajokulu.stajokulu2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MobileLine {
    @Id
    private String phoneNumber;

    private String openDate;

    private String closeDate;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "identityNumber")
    private Customer customer;

    @OneToMany(mappedBy = "mobileLine")
    private List<BalanceUnit> balanceUnitList;
}
