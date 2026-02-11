package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
    private String codigo;
    private String nombre;
    private String direccion;
    private List<Productos> productos = new ArrayList<>();

    public Pedidos() {
    }

    public Pedidos(String codigo, String nombre, String direccion, List<Productos> productos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = productos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "pedidos{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", productos=" + productos +
                '}';
    }

    public void agregar_productos(Productos producto) {
        this.productos.add(producto);
    }

}
