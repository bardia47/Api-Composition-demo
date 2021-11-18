package com.demo.repository;

import com.demo.entity.Address;
import com.demo.pojo.RichPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface AddressRepository extends JpaRepository<Address,Long> {
    @Query("SELECT new com.demo.pojo.RichPojo(m.userId,SUM(m.amount)) FROM Address m group by m.userId HAVING SUM(m.amount)>?1 order by m.userId ")
    public List<RichPojo> getRiches(BigDecimal money);
}
