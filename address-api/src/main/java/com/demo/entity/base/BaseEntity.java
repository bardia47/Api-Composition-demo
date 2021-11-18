package com.demo.entity.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
//IdColumnNameAnnotation is required in extending (if id column name is not "id")!!!!!
public @Data class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

}
