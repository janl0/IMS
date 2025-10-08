package com.janlindauer.inventory_system.logic;

import com.janlindauer.inventory_system.entity.Product;
import com.janlindauer.inventory_system.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service with CRUD operations for product entity
 */
@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    /**
     * @return all products
     */
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    /**
     * @param id of product to return
     * @return product with given id
     */
    public Optional<Product> getProductByID(Long id)
    {
        return productRepository.findById(id);
    }

    /**
     * @param product to save
     * @return saved product
     */
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    /**
     * @param id of product to delete
     */
    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }

    /**
     * @param id product id
     * @param productDetails product details
     * @return updated product
     */
    public Product updateProduct(Long id, Product productDetails)
    {
        Product product = productRepository.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setSku(productDetails.getSku());
        product.setCurrentQuantity(productDetails.getCurrentQuantity());
        return productRepository.save(product);
    }
}
