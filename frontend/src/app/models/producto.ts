import { Categoria } from "./categoria";

export class Producto {
    id!: number;
    nombre!: string;
    detalle!: string;
    precio!: number;
    imagen!: string;
    categoria!: Categoria;

}
