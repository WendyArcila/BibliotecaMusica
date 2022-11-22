package com.sofka.taller3;

import java.time.Year;
import java.util.List;
/**
 * Interfaz con métodos para ordenar las listas de canciones.
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-211
 */
public interface IOrder {

    /**
     * Imprime en pantalla las canciones de un mismo género
     * @param songList Lista de canciones que se desea filtrar
     * @param genre género por el cual se desea filtrar
     */
    void findGenre(List<Song> songList, String genre);

    /**
     * Imprime en pantalla las canciones de un mismo año
     * @param songList Lista de canciones que se desea filtrar
     * @param year año por el cual se desea filtrar
     */
    void findYear(List<Song> songList, Year year);

    /**
     * Imprime en orden ascendente la lista de canciones según su duración
     * @param songList Lista de canciones que se desea filtrar
     */
    void ascendantDuration(List<Song> songList);

    /**
     * Imprime en orden descendente la lista de canciones según su duración
     * @param songList Lista de canciones que se desea filtrar
     */
    void descendentDuration(List<Song> songList);

    /**
     * Imprime en orden ascendente la lista de canciones según su fecha
     * @param songList Lista de canciones que se desea filtrar
     */
    void ascendantDate(List<Song> songList);

    /**
     * Imprime en orden descendente la lista de canciones según su fecha
     * @param songList Lista de canciones que se desea filtrar
     */
    void descendentDate(List<Song> songList);

    /**
     * Imprime en orden ascendente la lista de canciones según su ID
     * @param songList Lista de canciones que se desea filtrar
     */
    void normalOrder(List<Song> songList);

    /**
     * Imprime en orden descendente la lista de canciones según su ID
     * @param songList Lista de canciones que se desea filtrar
     */
    void reverseNormalOrder(List<Song> songList);
}
