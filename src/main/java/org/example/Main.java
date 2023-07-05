package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
    Integer edad=25;
    //los objetos son variables, pero especiales
        Universidad objetoUniversidad=new Universidad();
        Usuario objetoUsuario=new Usuario(25,"juan","234",4,"juan@gmail.com");

        //creo un objeto para acceder o modificar los atributos  o metodos de ese objeto
        System.out.println(objetoUniversidad.nombres);
        System.out.println(objetoUsuario.nombres);
    }
}