package com.personal.demo.http.controller;

import java.util.List;

import com.personal.demo.model.Categoria;
import com.personal.demo.model.Tarea;
import com.personal.demo.repository.CategoriaRepository;
import com.personal.demo.repository.TareaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("tareas")
@CrossOrigin
public class TareaController {
    
    @Autowired
    TareaRepository repository;

    @Autowired
    CategoriaRepository repository2;

    @GetMapping("all")
    public List<Tarea> getAll(){
            return (List<Tarea>) repository.findAll();
    }

    @GetMapping("allCategorias")
    public List<Categoria> getAllCategorias(){
            return (List<Categoria>) repository2.findAll();
    }

    @PostMapping("save")
    public Tarea save(@ModelAttribute Tarea tarea){
        //System.out.println("pasando por aca");
        return repository.save(tarea);
    }

    @DeleteMapping("delete/{id}")
    public Integer delete (@PathVariable Integer id){
        try {
            repository.delete(repository.findById(id).get());
            return 1;
        } catch (Exception e) {
            //TODO: handle exception
            return 0;
        }
       
    }

    @PutMapping("update/{id}")
    public Integer update(@PathVariable Integer id, @ModelAttribute Tarea tarea){
        try { 
            tarea.setId(id);
            repository.save(tarea);
            return 1;
        } catch (Exception e) {
            //TODO: handle exception
            return 0;
        }
       
    }

}
