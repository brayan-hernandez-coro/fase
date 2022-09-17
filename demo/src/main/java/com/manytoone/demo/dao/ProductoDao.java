package com.manytoone.demo.dao;

import com.manytoone.demo.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long> {


}
