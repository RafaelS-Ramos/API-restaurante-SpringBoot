package com.POO.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.POO.restaurante.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}