package com.janlindauer.inventory_system.repository;

import com.janlindauer.inventory_system.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {}

