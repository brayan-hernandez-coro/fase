import { Component, OnInit } from '@angular/core';
import { Producto } from 'src/app/models/producto';
import { ProductoService } from 'src/app/services/producto.service';

@Component({
  selector: 'app-imagen',
  templateUrl: './imagen.component.html',
  styleUrls: ['./imagen.component.css']
})
export class ImagenComponent implements OnInit {

  productos : Producto[] = [];
  constructor(private productosService: ProductoService) { }

  ngOnInit(): void {
    this.productosService.getProductos()
    .subscribe(response => this.productos = response);
  }

}
