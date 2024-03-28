package com.projetoSpringBoot.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringBoot.projetoSpring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
