package com.example.haren201930326.repository;

import com.example.haren201930326.entity.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByName(String name, Sort sort);
    Long countByPrice(int price);
    boolean existsByNumber(Long number);
    Product findByNameAndPrice(String name, int price);
    List<Product> findByNameOrderByPriceDesc(String name);
    List<Product> findAllByOrderByPriceAsc();
}
