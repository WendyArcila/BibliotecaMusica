package com.sofka.taller3;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Clase está compuesta de métodos que permiten al usuario elegir entre las opciones del menú
 * para ordenar listas de canciones
 * Poner en funcionamiento las opciones del menú para ordenar listas de canciones
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class MenuOrder extends MenuOptions{

    private final ShowOrder showOrder = new ShowOrder();

    /**
     * Constructor de la clase MenuMain, implementa los menús
     */
    public MenuOrder() {

        setMenu1("Cómo desea ordenar sus canciones:");
        setMenu2("1. Filtrar por género");
        setMenu3("2. Filtrar por año");
        setMenu4("3. Ordenar por duración");
        setMenu5("4. Ordenar por fecha\n" +
                "5. Volver al menú anterior");
    }

    /**
     * Ciclo infinito que cierra cuando el usuario ingresa la información correctamente,
     * mantiene en funcionamiento el menú, hasta que el usuario decida salir.
     * @throws InputMismatchException debe recibir números
     */
    @Override
    public void cycle(List<Song> songList){
        for (;;) {
            try {
                setFlag(true);
                while (isFlag()) {
                    setFlag(process(songList));
                }return;
            }catch (InputMismatchException e){
                System.out.println("Solo debe ingresar números dentro de las opciones disponibles");
            }
        }
    }

    /**
     * Estructura de control que implementa los métodos para cumplir con el menú.
     * @param option opción elegida por el usuario para realizar dentro del programa
     * @param songList Lista de canciones
     * @return un boolean con la continuidad del programa (repetición del menú)
     */
    @Override
    public boolean menuFunctionality(int option, List<Song> songList) {
        switch (option){
            case 1:
                showOrder.choiceGenre(songList);
                showOrder.presetOrder(songList);
                return true;
            case 2:
                showOrder.choiceYear(songList);
                showOrder.presetOrder(songList);
                return true;
            case 3:
                showOrder.orderDuration(songList);
                showOrder.presetOrder(songList);
                return true;
            case 4:
                showOrder.orderDate(songList);
                showOrder.presetOrder(songList);
                return true;
            case 5:
                return false;
            default:
                System.out.println("Ingrese un número que corresponda a las opciones");
        }
        return true;
    }
}
