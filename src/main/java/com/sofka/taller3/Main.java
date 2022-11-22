package com.sofka.taller3;

/**
 * Clase que pone en funcionamiento la clase MenuMain que contiene los funcionamientos del programa
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class Main {
    /**
     * Ejecuta la clase MenuMain que contiene los funcionamientos del programa
     */
    public static void main(String[] args) {

        MenuMain menuMain = new MenuMain();

        System.out.println("Bienvenido a la app MusikPlay");

        menuMain.cycle();
    }
}