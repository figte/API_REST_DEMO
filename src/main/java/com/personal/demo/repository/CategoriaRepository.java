package com.personal.demo.repository;

import com.personal.demo.model.Categoria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria,Integer>{
    
}
