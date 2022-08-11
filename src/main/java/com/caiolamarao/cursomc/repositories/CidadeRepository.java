package com.caiolamarao.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiolamarao.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
