package com.example.repository.repository;

import com.example.repository.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    Product findByType(String type);    //select * by type
    List<Product> findByDescriptionAndCategory(String description, String category);        //select * by description AND Category
    List<Product> findByCategoryAndNameIn(String category, List<String> name);              //select * by category AND name
}
