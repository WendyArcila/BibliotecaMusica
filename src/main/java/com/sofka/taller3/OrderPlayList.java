package com.sofka.taller3;

import java.time.Year;
import java.util.Comparator;
import java.util.List;

/**
 * Clase que implementa la Interfaz que contiene los métodos para ordenar las listas de canciones.
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class OrderPlayList implements IOrder {

    /**
     * Imprime en pantalla las canciones de un mismo género
     * @param songList Lista de canciones que se desea filtrar
     * @param genre género por el cual se desea filtrar
     */
    @Override
    public void findGenre(List<Song> songList, String genre) {
        for (Song song : songList) {
            if (song.getGenre().equals(genre)) {
                System.out.println(song.getGenre() + song.toString());
            }
        }
    }

    /**
     * Imprime en pantalla las canciones de un mismo año
     * @param songList Lista de canciones que se desea filtrar
     * @param yearToFind año por el cual se desea filtrar
     */
    @Override
    public void findYear(List<Song> songList, Year yearToFind) {
        Year year;
        for (Song song : songList) {
            year = Year.of(song.getDate().getYear());
            if (year.equals(yearToFind)) {
                System.out.println(song.toString());
            }
        }
    }

    /**
     * Imprime en orden ascendente la lista de canciones según su duración
     * @param songList Lista de canciones que se desea filtrar
     */
    @Override
    public void ascendantDuration(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDuration));
            System.out.println(songList.get(i).toString());
        }
    }

    /**
     * Imprime en orden descendente la lista de canciones según su duración
     * @param songList Lista de canciones que se desea filtrar
     */
    @Override
    public void descendentDuration(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDuration).reversed());
            System.out.println(songList.get(i).toString());
        }
    }

    /**
     * Imprime en orden ascendente la lista de canciones según su fecha
     * @param songList Lista de canciones que se desea filtrar
     */
    @Override
    public void ascendantDate(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDate));
            System.out.println(songList.get(i).toString());
        }
    }

    /**
     * Imprime en orden descendente la lista de canciones según su fecha
     * @param songList Lista de canciones que se desea filtrar
     */
    @Override
    public void descendentDate(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDate).reversed());
            System.out.println(songList.get(i).toString());
        }
    }

    /**
     * Imprime en orden ascendente la lista de canciones según su ID
     * @param songList Lista de canciones que se desea filtrar
     */
    @Override
    public void normalOrder(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getId));
            System.out.println(songList.get(i).toString());
        }
    }

    /**
     * Imprime en orden descendente la lista de canciones según su ID
     * @param songList Lista de canciones que se desea filtrar
     */
    @Override
    public void reverseNormalOrder(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getId).reversed());
            System.out.println(songList.get(i).toString());
        }
    }
}
