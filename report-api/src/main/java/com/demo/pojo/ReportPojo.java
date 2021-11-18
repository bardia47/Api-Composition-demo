package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
@AllArgsConstructor
public @Data class ReportPojo {
    String nationalCode;
    String name;
    String money;
}
