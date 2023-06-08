package com.example.haren201930326.service.impl;

import com.example.haren201930326.dto.ProductDto;
import com.example.haren201930326.dto.ProductResponseDto;
import com.example.haren201930326.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponseDto getProduct(Long number) {
        return null;
    }

    @Override
    public List<ProductResponseDto> getProductByName(String name) {
        return null;
    }

    @Override
    public ProductResponseDto saveProduct(ProductDto productDto) {
        return null;
    }

    @Override
    public ProductResponseDto getProductByNameAndPrice(String name, int price) {
        return null;
    }

    @Override
    public List<ProductResponseDto> listProductByName(String name) {
        return null;
    }

    @Override
    public List<ProductResponseDto> list() {
        return null;
    }

    @Override
    public List<ProductResponseDto> listByStock(int stock) {
        return null;
    }

    @Override
    public List<ProductResponseDto> allProduct() {
        return null;
    }

    @Override
    public Long countByPrice(int price) {
        return null;
    }

    @Override
    public boolean existsByNumber(Long number) {
        return false;
    }

    @Override
    public ProductResponseDto changeProductName(Long number, String name) throws Exception {
        return null;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {

    }
}
