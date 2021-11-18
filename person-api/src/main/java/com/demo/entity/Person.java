package com.demo.entity;

import com.demo.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@AllArgsConstructor
@NoArgsConstructor
public @Data
class Person extends BaseEntity {
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "nationalCode",unique = true)
    private String nationalCode;

}
