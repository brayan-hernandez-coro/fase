package com.manytoone.demo.services;

import com.manytoone.demo.dao.CategoriaDao;
import com.manytoone.demo.models.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServicelmpl implements  CategoriaService {
   @Autowired
   private CategoriaDao categoriaDao;


    @Override
    public List<Categoria> findAll() {
        return categoriaDao.findAll();
    }
}
