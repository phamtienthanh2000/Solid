package com.company.intersegrega.service;

import com.company.intersegrega.entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderPersistenceService implements  PersistenceService<Order>{
    Map<Long,Order> dataStorage = new HashMap<>();
    @Override
    public void save(Order entity) {
        dataStorage.put(entity.getId(),entity);
    }

    @Override
    public void delete(Order entity) {

        dataStorage.remove(entity.getId());

    }

    @Override
    public Order findById(Long id) {
        return dataStorage.get(id);
    }

    // method này vô nghĩa với lớp này
    @Override
    public List<Order> findByName(String name) {
        throw new UnsupportedOperationException("This method is meaningless for me");
    }
}
