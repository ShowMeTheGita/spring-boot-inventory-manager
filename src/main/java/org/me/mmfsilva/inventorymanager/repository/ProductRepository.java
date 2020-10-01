package org.me.mmfsilva.inventorymanager.repository;

import org.me.mmfsilva.inventorymanager.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findByName(String name);

    List<Product> findByQuantity(int quantity);
}
