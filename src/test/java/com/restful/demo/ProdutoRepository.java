package com.restful.demo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContaining(String nome);
}