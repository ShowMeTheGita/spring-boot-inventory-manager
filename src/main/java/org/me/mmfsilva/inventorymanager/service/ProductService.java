package org.me.mmfsilva.inventorymanager.service;

import org.me.mmfsilva.inventorymanager.entity.Product;
import org.me.mmfsilva.inventorymanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public Product saveOrUpdateProduct(Product product) {

        if (repository.findByName(product.getName()) == null && !product.getName().equals("") && !product.getName().matches("[0-9]+")) {
            Product newProd = new Product();
            newProd.setName(product.getName().toLowerCase());
            newProd.setQuantity(product.getQuantity());
            repository.save(newProd);
        }

        Product prod = repository.findByName(product.getName());

        prod.setName(product.getName());
        prod.setQuantity(product.getQuantity());

        return repository.save(prod);

    }

    public Iterable<Product> saveProducts (List<Product> products) {
        return repository.saveAll(products);
    }

    public Iterable<Product> getProducts() {
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

        Product toDeleteProd = repository.findById(id).orElse(null);

        if (toDeleteProd != null) {
            repository.delete(toDeleteProd);
            return "Product with id " + id + " and name " + toDeleteProd.getName().toUpperCase() + " has been successfully deleted";
        }

        return "Cannot delete product. Product with id " + id + " does not exist";
    }

    public String deleteProduct(Product product) {

        repository.delete(product);
        return "Product deleted. Id was " + product.getId() + ".";
    }

    public Product updateProductByName(Product product) {

        Product prod = repository.findByName(product.getName());
        prod.setName(product.getName());
        prod.setQuantity(product.getQuantity());

        return repository.save(prod);
    }





}
