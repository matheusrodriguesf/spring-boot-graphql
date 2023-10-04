package br.com.arcelino.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arcelino.comprasservice.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
