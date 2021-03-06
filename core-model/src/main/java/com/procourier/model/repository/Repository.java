package com.procourier.model.repository;

import com.procourier.model.Courier;
import com.procourier.model.Order;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Optional<T> findById(Long id);
    List<T> getAll();
    Long put(T order);
    List<Long> putAll(List<T> items);
}
