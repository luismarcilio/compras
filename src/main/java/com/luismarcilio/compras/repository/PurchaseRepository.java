package com.luismarcilio.compras.repository;

import org.springframework.data.repository.CrudRepository;

import com.luismarcilio.compras.data.*;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {

}