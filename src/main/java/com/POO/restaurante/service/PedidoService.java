package com.POO.restaurante.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.POO.restaurante.model.Pedido;
import com.POO.restaurante.repository.PedidosRepository;

@Service
public class PedidoService {
    private final PedidosRepository repository;

    public PedidoService(PedidosRepository repository) {
        this.repository = repository;
    }

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Pedido salvar (Pedido pedido) {
        return repository.save(pedido);
    }

    public Pedido atualizar(Long id, Pedido pedidoAtualizado) {
        Pedido pedido = repository.findById(id).orElseThrow();
        pedido.setDescricao(pedidoAtualizado.getDescricao());
        pedido.setQuantidade(pedidoAtualizado.getQuantidade());
        pedido.setValorTotal(pedidoAtualizado.getValorTotal());
        pedido.setDataPedido(pedidoAtualizado.getDataPedido());
        pedido.setCliente(pedidoAtualizado.getCliente());
        return repository.save(pedido);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
