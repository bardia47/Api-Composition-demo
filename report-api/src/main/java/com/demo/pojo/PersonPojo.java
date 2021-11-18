package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
public @Data  class PersonPojo {
    private String firstName;
    private String lastName;
    private String nationalCode;
    private String id;


}
