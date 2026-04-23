package com.POO.restaurante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.POO.restaurante.model.Pedido;

public interface PedidosRepository extends JpaRepository<Pedido, Long> {   
}