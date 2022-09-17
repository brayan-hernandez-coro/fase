import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ImagenComponent } from './components/imagen/imagen.component';
import { InicioComponent } from './components/inicio/inicio.component';
import { ProductosFormComponent } from './components/productos-form/productos-form.component';
import { ProductosComponent } from './components/productos/productos.component';
/* Definimos la rutas para acceder a las paginas*/
const routes: Routes = [
  {path: 'inicio', component: ProductosComponent},
  {path: 'formulario', component:ProductosFormComponent},
  {path: 'formulario/:id', component:ProductosFormComponent},
  {path: 'imagen', component:ImagenComponent},
  {path: '', component:InicioComponent}

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
