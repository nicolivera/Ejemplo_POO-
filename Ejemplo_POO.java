/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_poo_ddr_08;

/**
 *
 * @author nikko
 */
public class Ejemplo_POO {
 
    public static void main(String[] args) {
 
        //Creamos los objetos
        Comercial c1 = new Comercial(300, "DDR", 37, 1000);
        Repartidor r1 = new Repartidor("zona 3", "Fer", 26, 900);
 
        //Llamamos a plus
        c1.plus();
        r1.plus();
 
        //Mostramos la informacion
        System.out.println(c1);
        System.out.println(r1);
    }
 
}
