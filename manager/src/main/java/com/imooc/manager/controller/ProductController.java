package com.imooc.manager.controller;
import com.imooc.entity.Product;
import com.imooc.manager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
       return productService.addProduct(product);
    }

    @GetMapping("/peoducts/{id}")
    public Product queryProductById(@PathVariable("id") String id){
                  return productService.queryProductById(id);
    }

}
