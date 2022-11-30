package com.projetooka.projetooka.controller;

import com.projetooka.projetooka.model.Categoria;
import com.projetooka.projetooka.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

   @GetMapping
    public ResponseEntity<List<Categoria>> getAll(){
       return ResponseEntity.ok(categoriaRepository.findAll());
   }

   @GetMapping("/{id}")
    public ResponseEntity<Categoria> getById(@PathVariable Long id){
       return categoriaRepository.findById(id)
               .map(res -> ResponseEntity.ok(res))
               .orElse(ResponseEntity.notFound().build());
   }

}
