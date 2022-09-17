package com.manytoone.demo.controllers;

import com.manytoone.demo.models.Categoria;
import com.manytoone.demo.models.Producto;
import com.manytoone.demo.services.CategoriaService;
import com.manytoone.demo.services.ProductoService;
import org.hibernate.exception.DataException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin (origins =  {"*"})
@RestController
@RequestMapping ("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping("/listar")
    public ResponseEntity<List<Producto>> listarProducotos(){
        return new ResponseEntity<>(productoService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/categorias")
    public ResponseEntity<List<Categoria>> listarCategorias(){
        return new ResponseEntity<>(categoriaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id){
        return new ResponseEntity<>(productoService.findById(id), HttpStatus.OK);
    }

    @PostMapping ("/crear")
public ResponseEntity <Producto> crearProducto(@RequestBody Producto producto){
    return new ResponseEntity<>(productoService.save(producto),HttpStatus.CREATED);
    }
@PutMapping ("/actualizar/{id}")
public ResponseEntity <Producto> actualizarProducto(@PathVariable Long id,@RequestBody Producto producto){
Producto productoEncontrado = productoService.findById(id);
if(productoEncontrado == null){
    return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
try{
    productoEncontrado.setNombre(producto.getNombre());
    productoEncontrado.setPrecio(producto.getPrecio());
    productoEncontrado.setImagen(producto.getImagen());
    productoEncontrado.setDetalle(producto.getDetalle());
    productoEncontrado.setCategoria(producto.getCategoria());
    return new ResponseEntity<>(productoService.save(productoEncontrado),HttpStatus.CREATED);
}catch (DataAccessException e ){
    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

}
}
@DeleteMapping ("/eliminar/{id}")
    public  ResponseEntity<?> actulizarProducto(@PathVariable Long id){
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
}

}
