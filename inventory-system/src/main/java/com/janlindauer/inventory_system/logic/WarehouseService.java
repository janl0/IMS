package com.janlindauer.inventory_system.logic;

import com.janlindauer.inventory_system.entity.Product;
import com.janlindauer.inventory_system.entity.Warehouse;
import com.janlindauer.inventory_system.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WarehouseService
{
    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<Warehouse> getAllWarehouses()
    {
        return warehouseRepository.findAll();
    }

    public Optional<Warehouse> getWarehouseById(Long id)
    {
        return warehouseRepository.findById(id);
    }

    public Warehouse saveWarehouse(Warehouse warehouse)
    {
        return warehouseRepository.save(warehouse);
    }

    public void deleteWarehouse(Long id)
    {
        warehouseRepository.deleteById(id);
    }

    public Warehouse updateWarehouse(Long id, Warehouse warehouseDetails)
    {
        Warehouse warehouse = warehouseRepository.findById(id).orElseThrow();
        warehouse.setId(warehouseDetails.getId());
        warehouse.setName(warehouseDetails.getName());
        warehouse.setAddress(warehouseDetails.getAddress());
        return warehouseRepository.save(warehouse);
    }
}
