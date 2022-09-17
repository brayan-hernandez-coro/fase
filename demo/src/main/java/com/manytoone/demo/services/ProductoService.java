package com.manytoone.demo.services;

import com.manytoone.demo.models.Producto;

import java.util.List;

public interface ProductoService {
    public Producto save(Producto producto);

    public Producto findById(Long id);

    public List <Producto> findAll();

    public void delete (Long id);

}
