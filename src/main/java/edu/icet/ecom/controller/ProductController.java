package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //---> @Controller + @ResponseBody + @Component
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    List<Product> getProduct(){

        List<Product> products = service.getProducts();

        return products;
    }
}
