package com.sofka.taller3;

import java.time.LocalDate;

/**
 * Clase permite crear objetos de tipo Song (canciones)
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class Song {
    private String name;
    private Integer id;
    private LocalDate date;
    private Double duration;
    private String genre;
    private  String cover;
    private  String description;

    /**
     * Constructor de la clase Song (canción)
     * @param name nombre de la canción
     * @param id identificador de la canción
     * @param date fecha de publicación de la canción
     * @param duration duración de la canción
     * @param genre género al que pertenece la canción
     * @param cover portada de la canción (enlace)
     * @param description descripción de la canción, escritores.
     */
    public Song(String name, Integer id, LocalDate date, Double duration,String genre, String cover, String description) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.genre=genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Constructor de la clase Song vacío
     */
    public Song() {
    }

    /**
     * Obtiene el nombre de la canción
     * @return nombre de la canción
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el ID de la canción
     * @return ID de la canción
     */
    public Integer getId() {
        return id;
    }

    /**
     * Obtiene la fecha de publicación de la canción
     * @return fecha de la canción
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Obtiene la duración de la canción
     * @return duración de la canción
     */
    public Double getDuration() {
        return duration;
    }

    /**
     * Obtiene el género de la canción
     * @return género de la canción
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sobreescribe el método toString para imprimir toda la información de la canción de forma ordenada.
     * @return un String de la canción de forma ordenada.
     */
    @Override
    public String toString() {
        return  " " + id + ", " + name + ", " + date + ", " + duration + ", " + genre + ", " + cover + ", " + description + "\n";
    }
}
