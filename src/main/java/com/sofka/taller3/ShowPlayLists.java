package com.sofka.taller3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Clase está compuesta de métodos que permiten mostrar en pantalla las playlists creadas por el usuario
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class ShowPlayLists {
    private final List<String> namePlaylist = new ArrayList<>();

    private final List<List<Song>> listToList = new ArrayList<>();

    /**
     * Añade una lista de canciones a una Lista de Listas de canciones.
     * @param songList Lista de canciones a guardar.
     */
    public void addPlayList(List<Song> songList){
        this.listToList.add(songList);
    }

    /**
     * Añade el nombre de la playList a una Lista de Strings (nombres de playList)
     * @param name nombre de la playList
     */
    public void addNamePlayList(String name){
        this.namePlaylist.add(name);
    }

    /**
     * Muestra en pantalla el nombre de las playlists con un identificador
     * @return la opción elegida por el usuario de la playlist que desea ver.
     */
    public int showPlayList(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <this.namePlaylist.size() ; i ++ ) {
            int j = i+1;
            System.out.println(j + ". " + this.namePlaylist.get(i));
        }
        String choicePlaylist = "Cuál PlayList deseas ver";
        System.out.println(choicePlaylist);
        return input.nextInt();
    }

    /**
     * Ciclo infinito que para cuando el usuario ingresa la información correctamente
     * Imprime en pantalla la playList elegida por el usuario canción por canción.
     * @throws InputMismatchException error en la información ingresada
     */
    public void selectPlayList(){
        for(;;) {
            try {
                int option = showPlayList();
                for (int i = 0; i < this.namePlaylist.size(); i++) {
                    int p = i + 1;
                    if (option == p) {
                        System.out.println(this.namePlaylist.get(i));
                        for (int j = 0; j < this.listToList.get(i).size(); j++) {
                            System.out.println(this.listToList.get(i).get(j).toString());
                        }return;
                    }
                }System.out.println("la opción elegida no existe");
            } catch (InputMismatchException e) {
                System.out.println("Solo debe ingresar números dentro de las opciones disponibles");
            }
        }
    }
}
