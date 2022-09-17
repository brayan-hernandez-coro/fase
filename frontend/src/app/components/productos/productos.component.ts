import { Component, OnInit } from '@angular/core';
import { Producto } from 'src/app/models/producto';
import { ProductoService } from 'src/app/services/producto.service';

@Component({
  selector: 'app-productos',
  templateUrl: './productos.component.html',
  styleUrls: ['./productos.component.css']
})
export class ProductosComponent implements OnInit {
[x: string]: any;
productos: Producto[] = [];

  constructor(private productoService:ProductoService) { }

  ngOnInit(): void {
    this.productoService.getProductos()
    .subscribe(response => this.productos = response)
  }

  eliminarProducto(id: number){
this.productoService.elimianrProducto(id)
.subscribe(response =>{
  console.log("Articulo Eliminado!!!!");
  this.productos = this.productos.filter(producto => producto.id != id)
})
  }
}
