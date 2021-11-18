package com.demo.controller;
import com.demo.pojo.PersonPojo;
import com.demo.pojo.ReportPojo;
import com.demo.pojo.RichPojo;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ReportController {



    @GetMapping("/report/")
    private List<ReportPojo> getReport(@RequestParam("money") String money) {
        WebClient webClient = WebClient.create();
        RichPojo[] richesList =  webClient.get().uri("http://localhost:8082/address/riches/?money="+money).retrieve().bodyToMono(RichPojo[].class).block();
       String reqParam="";
       for (RichPojo rich : richesList)
           reqParam += "," + rich.getId() ;
        reqParam = reqParam.substring(1);
       PersonPojo[] persons = webClient.get().uri("http://localhost:8080/person/?ids="+ reqParam).retrieve().bodyToMono(PersonPojo[].class).block();
       List<ReportPojo> pojos = new ArrayList<>();
       for (int i=0;i<richesList.length;i++)
           pojos.add(new ReportPojo((String) persons[i].getNationalCode(),persons[i].getFirstName() +" " + persons[i].getLastName() , richesList[i].getMoney()));


        return pojos;
    }

}
