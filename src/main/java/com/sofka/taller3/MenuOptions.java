package com.sofka.taller3;

import java.util.List;
import java.util.Scanner;

/**
 * Clase abstracta que contiene los elementos necesario para un menú de opciones
 * Implementa el método showMenu que muestra en pantalla el menú de opciones
 * Implementa el método process que retorna un boolean para la continuidad del cyclo.
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public abstract class MenuOptions {
    private String menu1;
    private String menu2;
    private String menu3;
    private String menu4;
    private String menu5;
    private boolean flag;

    /**
     * Constructor vacío
     */
    protected MenuOptions() {
    }

    /**
     * Estructura de control que implementa los métodos para cumplir con el menú.
     *
     * @param option   opción elegida por el usuario para realizar dentro del programa
     * @param songList Lista de canciones
     * @return un boolean con la continuidad del programa (repetición del menú)
     */
    public abstract boolean menuFunctionality(int option, List<Song> songList);

    /**
     * Ciclo infinito que cierra cuando el usuario ingresa la información correctamente,
     * mantiene en funcionamiento el menú, hasta que el usuario decida salir.
     */
    public void cycle(List<Song> songList) {
        System.out.println(songList);
    }

    /**
     * Muestra en pantalla el menú y retorna la opción elegida por el usuario
     *
     * @return Entero Opción del menú elegida por el usuario.
     */
    public int showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println(this.menu1 + "\n" + this.menu2 + "\n" + this.menu3 + "\n" + this.menu4 + "\n" + this.menu5);
        return input.nextInt();
    }

    /**
     * Pone en funcionamiento el ciclo con el menú y las opciones a elegir
     *
     * @param songList Lista de canciones
     * @return boolean sobre la continuidad del ciclo
     */
    public boolean process(List<Song> songList) {
        int option = showMenu();
        this.flag = menuFunctionality(option, songList);
        return this.flag;
    }

    /**
     * Obtiene el contenido del menu1
     *
     * @return cadena de texto con la descripción de la opción 1
     */
    public String getMenu1() {
        return menu1;
    }

    /**
     * Asigna un valor al menú1
     *
     * @param menu1 cadena de texto con la descripción de la opción 1
     */
    public void setMenu1(String menu1) {
        this.menu1 = menu1;
    }

    /**
     * Obtiene el contenido del menu2
     *
     * @return cadena de texto con la descripción de la opción 2
     */
    public String getMenu2() {
        return menu2;
    }

    /**
     * Asigna un valor al menú2
     *
     * @param menu2 cadena de texto con la descripción de la opción 2
     */
    public void setMenu2(String menu2) {
        this.menu2 = menu2;
    }

    /**
     * Obtiene el contenido del menu3
     *
     * @return cadena de texto con la descripción de la opción 3
     */
    public String getMenu3() {
        return menu3;
    }

    /**
     * Asigna un valor al menú3
     *
     * @param menu3 cadena de texto con la descripción de la opción 3
     */
    public void setMenu3(String menu3) {
        this.menu3 = menu3;
    }

    /**
     * Obtiene el contenido del menu4
     *
     * @return cadena de texto con la descripción de la opción 4
     */
    public String getMenu4() {
        return menu4;
    }

    /**
     * Asigna un valor al menú4
     *
     * @param menu4 cadena de texto con la descripción de la opción 4
     */
    public void setMenu4(String menu4) {
        this.menu4 = menu4;
    }

    /**
     * Obtiene el contenido del menu5
     *
     * @return cadena de texto con la descripción de la opción 5
     */
    public String getMenu5() {
        return menu5;
    }

    /**
     * Asigna un valor al menú5
     *
     * @param menu5 cadena de texto con la descripción de la opción 5
     */
    public void setMenu5(String menu5) {
        this.menu5 = menu5;
    }

    /**
     * Obtiene el valor de bandera (Flag)
     *
     * @return el valor de bandera (Flag)
     */
    public boolean isFlag() {
        return flag;
    }

    /**
     * Asigna el valor de bandera (Flag)
     *
     * @param flag el valor de bandera (Flag)
     */
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}
