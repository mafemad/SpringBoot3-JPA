package com.projetoSpringBoot.projetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpringBoot.projetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
