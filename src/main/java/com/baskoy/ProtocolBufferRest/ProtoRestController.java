package com.baskoy.ProtocolBufferRest;

import com.proto.rest.Product;
import com.proto.rest.Products;
import com.proto.rest.Type;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ProtoRestController {

    private List<Product> products = new ArrayList<>();

    public ProtoRestController() {
        createProducts();
    }

    @GetMapping("/products")
    public Products getProducts(){
        return Products.newBuilder().addAllProduct(
                products.stream().collect(Collectors.toList()))
                .build();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id){
        return products.get(id-1);
    }


    private void createProducts(){
        Product product = Product.newBuilder()
                .setId(1)
                .setName("MacBook Air")
                .setType(Type.ELECTRONIC)
                .setStock(2)
                .build();

        Product product1 = Product.newBuilder()
                .setId(2)
                .setName("Iphone X")
                .setType(Type.ELECTRONIC)
                .setStock(1)
                .build();

        Product product2 = Product.newBuilder()
                .setId(3)
                .setName("Dumbbell")
                .setType(Type.SPORT)
                .setStock(11)
                .build();

        products.add(product);
        products.add(product1);
        products.add(product2);
    }
}
