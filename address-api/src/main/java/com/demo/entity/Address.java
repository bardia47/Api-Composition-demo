package com.demo.entity;

import com.demo.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
public @Data
class Address extends BaseEntity {
    @Column(name = "location")
    private String location;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "userId")
    private Long userId;
}
