package com.projetoSpringBoot.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringBoot.projetoSpring.entities.OrderItem;
import com.projetoSpringBoot.projetoSpring.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
