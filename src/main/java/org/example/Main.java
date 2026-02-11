package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //agregar productos
        Productos producto = new Productos("120","mouse",130000);
        Productos producto2 = new Productos("213","teclado",190000);
        Productos producto3 = new Productos("320","pantalla",200000);
        //crear un pedido  y agregar pedidos
        Pedidos p1= new Pedidos("101010","carlos sanchez","calle 5-72", new ArrayList<>());
        p1.agregar_productos(producto);
        p1.agregar_productos(producto3);
        Pedidos p2= new Pedidos("123123","mateo", "calle 770-454",new ArrayList<>());
        p2.agregar_productos(producto2);

        //mostrar el pedido (todos los datos)
        System.out.println("primer pedido");
        System.out.println(p1);
        System.out.println("segundo pedido");
        System.out.println(p2);

        //mostrar los productos del pedido
        System.out.println("primera lista de pedido");
        for (Productos p : p1.getProductos()) {
            System.out.println(p);
        }
        System.out.println("segunda lista de pedido");
        for (Productos p : p2.getProductos()) {
            System.out.println(p);
        }


    }
}