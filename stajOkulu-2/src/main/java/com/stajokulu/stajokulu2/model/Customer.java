package com.stajokulu.stajokulu2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
public class Customer {
    @Id
    private String identityNumber;

    private String name;

    private String surname;

    private String gender;

    private String birthYear;

    private String adress;

    @OneToMany(mappedBy = "customer")
    private List<MobileLine> mobileLineList;

}
