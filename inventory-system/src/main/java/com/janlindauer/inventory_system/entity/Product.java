package com.janlindauer.inventory_system.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product 
{
    /**
     * UID of product
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * product name
     */
    private String name;

    /**
     * stock keeping unit of product
     */
    private String sku;

    /**
     * current quantity of product
     */
    private int currentQuantity;

    /**
     * @return the ID of the product
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the ID of the product
     *
     * @param id of the product
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the product name
     *
     * @param name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the sku of the product
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the sku of the product
     *
     * @param sku of the product
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return the current quantity of the product
     */
    public int getCurrentQuantity() {
        return currentQuantity;
    }

    /**
     * Sets the current quantity of the product
     *
     * @param currentQuantity of the product
     */
    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }
}
