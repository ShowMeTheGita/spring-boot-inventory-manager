package org.academiadecodigo.floppybirds.InventoryManager.controller;

import org.academiadecodigo.floppybirds.InventoryManager.entity.Product;
import org.academiadecodigo.floppybirds.InventoryManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping("/product/{pid}")
    public Product getProductById(@PathVariable int pid) {
        return productService.getProductById(pid);
    }

    @GetMapping("/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PutMapping("/product/update")
    public Product updateProductById(@RequestBody Product product) {
        return productService.saveProduct(product);
    }






}
