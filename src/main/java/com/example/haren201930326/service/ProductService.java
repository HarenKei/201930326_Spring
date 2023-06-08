package com.example.haren201930326.service;

import com.example.haren201930326.dto.ProductDto;
import com.example.haren201930326.dto.ProductResponseDto;

import java.util.List;

public interface ProductService {

    ProductResponseDto getProduct(Long number);

    List<ProductResponseDto> getProductByName(String name);

    ProductResponseDto saveProduct(ProductDto productDto);

    ProductResponseDto getProductByNameAndPrice(String name, int price);

    List<ProductResponseDto> listProductByName(String name);

    List<ProductResponseDto> list();

    List<ProductResponseDto> listByStock(int stock);

    List<ProductResponseDto> allProduct();

    Long countByPrice(int price);

    boolean existsByNumber(Long number);

    ProductResponseDto changeProductName(Long number, String name) throws Exception;

    void deleteProduct(Long number) throws Exception;
}