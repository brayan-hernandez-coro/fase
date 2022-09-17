package com.manytoone.demo.services;



import com.manytoone.demo.models.Categoria;

import java.util.List;

public interface CategoriaService {
    public List<Categoria> findAll();
}
