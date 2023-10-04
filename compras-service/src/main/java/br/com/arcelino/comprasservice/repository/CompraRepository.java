package br.com.arcelino.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arcelino.comprasservice.entity.Compra;

public interface CompraRepository extends JpaRepository<Compra, Long> {

}
