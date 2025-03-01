package edu.icet.ecom.service;

import edu.icet.ecom.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {

    public List<Product> getProducts(){
        Product product = new Product();
        product.setPrice(100.0);
        product.setDescription("delicious");
        product.setName("Orange");


        Product product2 = new Product("Apple","Good",150.0);


        Product product3 = Product.builder().name("Mango").description("Good").price(200.0).build();


//        ArrayList<Product> list = new ArrayList<>();
//        list.add(product);
//        list.add(product2);
//        list.add(product3);

        List<Product> list = Arrays.asList(product, product2, product3);

        return list;
    }
}
