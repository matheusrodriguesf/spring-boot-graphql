package br.com.arcelino.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.arcelino.comprasservice.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
