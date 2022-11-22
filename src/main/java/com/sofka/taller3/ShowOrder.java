package com.sofka.taller3;

import java.time.Year;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

/**
 * Clase que implementa las funciones que permiten mostrar la lista de canciones en el orden deseado por el usuario
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class ShowOrder {
    private Scanner input;

    private OrderPlayList orderPlayList = new OrderPlayList();

    /**
     * Toma los géneros y crea una lista de los ellos sin repetidos.
     * @param songList Lista de canciones
     * @return Lista (HashSet) de géneros sin repetidos
     */
    public Set<String> getGenres(List<Song> songList) {
        Set<String> genreList =new HashSet<>();
        for (Song song : songList) {
            genreList.add(song.getGenre());
        }
        return genreList;
    }

    /**
     * Muestra la lista de géneros como un menú de opciones
     * @param songList Lista de canciones
     * @return Lista(ArrayList) con los géneros
     */
    public List<String> showGenre(List<Song> songList){
        List<String> genreList = new ArrayList<>(getGenres(songList));
        for (int i = 0; i < genreList.size(); i++) {
            System.out.println(i+1 + ". " + genreList.get(i));
        }return genreList;
    }

    /**
     * Toma del usuario la decisión del filtro que desea hacer
     * @param message Cadena de texto que muestra el nombre del tipo de filtro que desea hacer
     * @return un entero que corresponde a la opción elegida por el usuario
     */
    public int choice(String message){
        input= new Scanner(System.in);
        System.out.println("Por cuál " + message + " deseas filtrar");
        return input.nextInt();
    }

    /**
     * Muestra la lista de canciones filtrada según el género elegido
     * @param songList Lista de canciones
     */
    public void choiceGenre(List<Song> songList){
        orderPlayList = new OrderPlayList();
        List<String> genreList=showGenre(songList);
        int option=choice("género");
        for (int i = 0; i < genreList.size() ; i++) {
            if (option == i+1) {
                orderPlayList.findGenre(songList,genreList.get(i));
            }
        }
    }

    /**
     * Toma los años y crea una lista de los ellos sin repetidos.
     * @param songList Lista de canciones
     * @return Lista (HashSet) de años sin repetidos
     */
    public Set<Year> getYears(List<Song> songList) {
        HashSet<Year> genreList =new HashSet<>();
        for (Song song : songList) {
            genreList.add(Year.of(song.getDate().getYear()));
        }
        return genreList;
    }

    /**
     * Muestra la lista de años como un menú de opciones
     * @param songList Lista de canciones
     * @return Lista(ArrayList) con los años
     */
    public List<Year> showYear(List<Song> songList){
        List<Year> yearsList = new ArrayList<>(getYears(songList));
        for (int i = 0; i < yearsList.size(); i++) {
            System.out.println(i+1 + ". " + yearsList.get(i));
        }return yearsList;
    }

    /**
     * Muestra la lista de canciones filtrada según el año elegido
     * @param songList Lista de canciones
     */
    public void choiceYear(List<Song> songList){
        List<Year> genreList=showYear(songList);
        int option=choice("año");
        for (int i = 0; i < genreList.size() ; i++) {
            if (option == i+1) {
                orderPlayList.findYear(songList,genreList.get(i));
            }
        }
    }

    /**
     * Muestra un menú con las opciones de orden de la lista de canciones general
     * @param message1 Tipo de acción que se desea hacer (Ordenar o volver atrás)
     * @param message2 Tipo de atributo por el que se desea ordenar
     * @return La opción elegida por el usuario
     */
    public int choiceOrder(String message1, String message2){
        input= new Scanner(System.in);
        System.out.println("1. "+ message1+ " por " + message2 + " ascendente\n" +
                "2. "+ message1+ " por " + message2 + " descendente");
        return input.nextInt();
    }

    /**
     * Muestra en pantalla el orden elegido por el usuario según la duración
     * @param songList lista de canciones
     */
    public void orderDuration(List<Song> songList){
        int option = choiceOrder("Ordenar", "duración");
        if (option == 1){
            orderPlayList.ascendantDuration(songList);
        } else {
            orderPlayList.descendentDuration(songList);
        }
    }

    /**
     * Muestra en pantalla el orden elegido por el usuario según la fecha
     * @param songList lista de canciones
     */
    public void orderDate(List<Song> songList){
        int option = choiceOrder("Ordenar", "fecha");
        if (option == 1){
            orderPlayList.ascendantDate(songList);
        } else {
            orderPlayList.descendentDate(songList);
        }
    }

    /**
     * Muestra en pantalla el orden elegido por el usuario según el ID
     * @param songList lista de canciones
     */
    public void presetOrder(List<Song> songList){
        int option = choiceOrder("Volver al ordenar" , "orden preestablecido");
        if (option == 1){
            orderPlayList.normalOrder(songList);
        } else {
            orderPlayList.reverseNormalOrder(songList);
        }
    }
}
