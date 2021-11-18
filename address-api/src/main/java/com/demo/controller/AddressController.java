package com.demo.controller;

import com.demo.entity.Address;
import com.demo.pojo.RichPojo;
import com.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressRepository repository;

    @GetMapping("/address/riches/")
    private List<RichPojo> getRiches(@RequestParam("money")BigDecimal money) {

      return repository.getRiches(money);

    }


    @PostMapping("/address/")
    private Address saveAddress(@RequestBody Address address) {
        return repository.save(address);
    }
}
