package com.sofka.taller3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Objects;

/**
 * Clase está compuesta de métodos que permiten al usuario crear una nueva playList
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class CreatePlayList {

    private final ShowPlayLists showPlayLists = new ShowPlayLists();

    private Scanner input;

    /**
     * Integra los métodos para crear una nueva playlist y finaliza mostrando la playList creada.
     */
    public void newPlayList(List<Song> songList){
        Integer[] songsSelected = parseIntChoice();
        List<Song> newSongList = createdNewList(songList, songsSelected);
        showPlayLists.addPlayList(newSongList);
        showNewPlayList(newSongList);
    }

    /**
     * Solicita al usuario los números(id) de las canciones con las cuales quiere conformar su playlist.
     * @return una array String con los números de las canciones seleccionadas
     */
    public String[] selectSongs(){
        input = new Scanner(System.in);
        String choiceSong = "Escriba el número de las canciones que desean que sean parte de su playList nueva " +
                "separado por un ', ' ";
        System.out.println(choiceSong);
        return input.nextLine().split(", ");
    }

    /**
     * Implementa el método selectSong y su retorno(lista de canciones elegidas) lo parsea a Integer; y ordena la lista de menor a mayor.
     * @return Una array Integer con las canciones elegidas ordenadas.
     * @throws NumberFormatException y  NullPointerException
     */
    public Integer[] parseIntChoice(){
       for(;;) {
           try {
               String[] choice = selectSongs();
               Integer[] choiceInt = new Integer[choice.length];
               for (int i = 0; i < choice.length; i++) {
                   choiceInt[i] = Integer.parseInt(choice[i]);
               }
               Arrays.sort(choiceInt);
               return choiceInt;
           } catch (NumberFormatException | NullPointerException e) {
               System.out.println("Debe ingresar solo números, separados por \", \"");
           }
       }
    }

    /**
     * Crea una nueva lista de canciones (playlist) que contiene las canciones elegidas por el usuario.
     * @param songList La lista de todas las canciones
     * @param choice Las canciones elegidas por el usuario para su nueva playlist
     * @return nueva lista de canciones(playlist)
     */
    public List<Song> createdNewList(List<Song> songList, Integer[] choice){
        List<Song> newList = new ArrayList<>();
        for (Integer integer : choice) {
            if (compareSelectSong(songList, integer).getId() != null) {
                newList.add(compareSelectSong(songList, integer));
            }
        }
        showPlayLists.addNamePlayList(choiceName());
        return newList;
    }

    /**
     * Comparar el ID de la lista con todas las canciones, con el ID de la lista elegida por el usuario.
     * @param songList Lista con todas las canciones
     * @param id ID de la canción elegida por el usuario
     * @return la canción elegida por el usuario o un mensaje diciendo que la información no existe y una canción vacía(null)
     */
    public Song compareSelectSong(List<Song> songList, Integer id){
        Song newSong = new Song();
        for (Song song : songList) {
            if (Objects.equals(id, song.getId())) {
                return song;
            }
        }
        System.out.println("La canción elegida con el id " + id + " no existe");
        return newSong;
    }

    /**
     * Invita al usuario a ingresar un nombre para su nueva playlist
     * @return el nombre de la nueva playlist
     */
    public String choiceName(){
        input = new Scanner(System.in);
        String choiceName = "Ingrese el nombre de su nueva lista";
        System.out.println(choiceName);
        return input.nextLine();
    }

    /**
     * Muestra en pantalla la nueva playlist canción por canción con su contenido.
     * @param newList la nueva lista de canciones elegida por el usuario
     */
    public void showNewPlayList(List<Song> newList){
        for (Song song : newList) {
            System.out.println(song.toString());
        }
    }

    /**
     * Trae e implementa el método selectPlayList de la clase showPlayList.
     */
    public void selectPlayList(){
        showPlayLists.selectPlayList();
    }
}
