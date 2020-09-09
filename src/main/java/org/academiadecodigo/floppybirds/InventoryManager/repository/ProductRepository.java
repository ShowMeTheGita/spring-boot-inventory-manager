package org.academiadecodigo.floppybirds.InventoryManager.repository;

import org.academiadecodigo.floppybirds.InventoryManager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findByName(String name);

    List<Product> findByQuantity(int quantity);
}
