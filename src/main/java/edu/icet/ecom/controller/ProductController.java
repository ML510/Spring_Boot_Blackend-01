package edu.icet.ecom.controller;

import edu.icet.ecom.model.Product;
import edu.icet.ecom.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //---> @Controller + @ResponseBody + @Component
@RequiredArgsConstructor
public class ProductController {

    // ************* Autowired ***********
//    @Autowired
//    ProductService service

    // ********** Constructor Dependency Injection ********
    final ProductService service;

//    public ProductController(ProductService service) {
//        this.service = service;
//    }

    @GetMapping("/products")
    List<Product> getProduct() {

        return service.getProducts();
    }
}
