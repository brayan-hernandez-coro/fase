package com.manytoone.demo.dao;

import com.manytoone.demo.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository <Categoria,Long> {

}
