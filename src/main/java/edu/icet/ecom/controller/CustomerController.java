package edu.icet.ecom.controller;

import edu.icet.ecom.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //---> @Controller + @ResponseBody + @Component
public class CustomerController {

    // ******************* PathVariable **********************

    @GetMapping("/search-customer/{nic}")
    Customer getCustomer(@PathVariable String nic){
        return null;
    }

    @GetMapping("/search-customerAndName/{nic}/{name}")
    Customer getCustomerAndName(@PathVariable String nic,
                                @PathVariable String name){
        return null;
    }

    // ******************* RequestParam **********************

    @GetMapping("/search-customer")
    Customer getCustomer2(@RequestParam(name = "nic") String nic){
        return null;
    }

    @GetMapping("/search-customerAndName")
    Customer getCustomerAndName2(@RequestParam(name = "nic") String nic,
                                 @RequestParam(name = "name") String name){
        return null;
    }
}
