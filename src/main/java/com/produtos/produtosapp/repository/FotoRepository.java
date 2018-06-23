package com.produtos.produtosapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.produtos.produtosapp.model.Fotos;

public interface FotoRepository extends JpaRepository<Fotos, Long> {

}
