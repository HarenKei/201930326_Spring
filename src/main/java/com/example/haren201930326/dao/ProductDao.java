package com.example.haren201930326.dao;

import com.example.haren201930326.entity.Product;

import java.util.List;

public interface ProductDao {

    Product insertProduct(Product product);

    Product selectProduct(Long number);

    List<Product> selectProductByName(String name);

    Product selectProductByNameAndPrice(String name, int price);

    Long countByPrice(int price);

    List<Product> listProductByName(String name);

    List<Product> listProductByPrice();

    List<Product> listByStock(int stock);

    List<Product> allProduct();

    boolean existsByNumber(Long number);

    Product updateProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
