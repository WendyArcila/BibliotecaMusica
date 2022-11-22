package com.sofka.taller3;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Clase está compuesta de métodos que permiten al usuario elegir entre las opciones del menú principal
 * Poner en funcionamiento las opciones del menú principal
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class MenuMain extends MenuOptions {
    private final MenuOrder menuOrder = new MenuOrder();
    private final Library library = new Library();
    private final NewSong newSong = new NewSong();
    private final CreatePlayList createPlayList = new CreatePlayList();

    /**
     * Constructor de la clase MenuMain, implementa los menús
     */
    public MenuMain() {
        setMenu1("Selecciones la opción de desea hacer:");
        setMenu2("1. Ver canciones disponibles");
        setMenu3("2. Ingresar una nueva canción");
        setMenu4("3. Crear PlayList nueva");
        setMenu5("4. Mostrar PlayLists creadas\n" +
                "5. Salir de la app");
    }

    /**
     * Estructura de control que implementa los métodos para cumplir con el menú.
     * @param option opción elegida por el usuario para realizar dentro del programa
     * @param songList Lista de canciones
     * @return un boolean con la continuidad del programa (repetición del menú)
     */
    @Override
    public boolean menuFunctionality(int option, List<Song> songList){
        switch (option){
            case 1:
                availableSongs(library.getSongList());
                menuOrder.cycle(library.getSongList());
                return true;
            case 2:
                library.addSong(newSong.saveNewSong(library.getSongList()));
                System.out.println(library.getSongList().toString());
                return true;
            case 3:
                availableSongs(library.getSongList());
                createPlayList.newPlayList(library.getSongList());
                return true;
            case 4:
                createPlayList.selectPlayList();
                return true;
            case 5:
                return false;
            default:
                System.out.println("Ingrese un número que corresponda a las opciones");
        }
        return true;
    }

    /**
     * Ciclo infinito que cierra cuando el usuario ingresa la información correctamente,
     * mantiene en funcionamiento el menú, hasta que el usuario decida salir.
     * @throws InputMismatchException
     */
    public void cycle(){
         for (;;) {
             try {
                 setFlag(true);
                 while (isFlag()) {
                     setFlag(process(library.getSongList()));
                 }return;
             } catch (InputMismatchException e) {
                 System.out.println("Solo debe ingresar números dentro de las opciones disponibles");
             }
         }
    }

    /**
     * Muestra todas las canciones disponibles
     * @param songList lista de canciones
     */
    public void availableSongs(List<Song> songList) {
        for (Song song : songList) {
            System.out.println(song.toString());
        }
    }
}
