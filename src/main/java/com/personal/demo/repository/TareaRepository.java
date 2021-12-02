package com.personal.demo.repository;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.personal.demo.model.Tarea;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TareaRepository extends CrudRepository<Tarea,Integer> {

}
