package com.projetoSpringBoot.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringBoot.projetoSpring.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
