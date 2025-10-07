package com.janlindauer.inventory_system.entity;

@Entity
@Table(name = "products")
public class Product 
{
    @Id
    @GeneratedValue
    private Long id;
}
