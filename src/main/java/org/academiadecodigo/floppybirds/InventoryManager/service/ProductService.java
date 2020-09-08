package org.academiadecodigo.floppybirds.InventoryManager.service;

import org.academiadecodigo.floppybirds.InventoryManager.entity.Product;
import org.academiadecodigo.floppybirds.InventoryManager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> saveProducts (List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    public List<Product> getProductsByQuantity(int quantity) {
        return repository.findByQuantity(quantity);
    }

    public String deleteProductById(int id) {
        repository.deleteById(id);
        return "Product with id " + id + " has been removed.";
    }

    public String deleteProduct(Product product) {
        repository.delete(product);
        return "Product deleted. Id was " + product.getId() + ".";
    }

    public Product updateProduct(Product product) {

        Product prod = repository.findById(product.getId()).orElse(null);
        prod.setName(product.getName());
        prod.setQuantity(product.getQuantity());

        return repository.save(prod);
    }





}
