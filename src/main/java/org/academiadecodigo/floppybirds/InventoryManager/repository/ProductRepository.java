package org.academiadecodigo.floppybirds.InventoryManager.repository;

import org.academiadecodigo.floppybirds.InventoryManager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}
