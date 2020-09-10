package org.academiadecodigo.floppybirds.InventoryManager.controller;

import org.academiadecodigo.floppybirds.InventoryManager.entity.Product;
import org.academiadecodigo.floppybirds.InventoryManager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ProductRESTController {

    @Autowired
    private ProductService productService;


    @PostMapping(path = "/addProduct")
    public Product addProduct(@RequestBody Product product) {
        product.setName(product.getName().toLowerCase());
        return productService.saveOrUpdateProduct(product);
    }

    @PostMapping(path = "/addProducts")
    public Iterable<Product> addProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @GetMapping(path = "/products")
    public Iterable<Product> getAllProducts() {
        return productService.getProducts();
    }

    @GetMapping(path = "/product/{pid}")
    public Product getProductById(@PathVariable int pid) {
        return productService.getProductById(pid);
    }

    @GetMapping(path = "/product/{name}")
    public Product getProductByName(@PathVariable String name) {
        return productService.getProductByName(name);
    }

    @PutMapping(path = "/product/update")
    public Product updateProductById(@RequestBody Product product) {
        return productService.saveOrUpdateProduct(product);
    }

    @DeleteMapping(path = "/product/delete/{id}")
    public String deleteProductById(@PathVariable int id) {

       return productService.deleteProductById(id);

    }






}
