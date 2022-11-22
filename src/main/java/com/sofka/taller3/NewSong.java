package com.sofka.taller3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

/**
 * Crea un nuevo objeto de tipo Song (nueva canción) con información ingresada por el usuario
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class NewSong {

    private final String[] details = {"nombre","fecha (yyyy-mm-dd)","duración", "género", "portada", "descripción"};
    private String[] information = new String[6];
    Scanner input;

    /**
     * Toma la información a guardar dada por el usuario
     * @param message Mensaje que informa al usuario cuál información ingresar
     * @return el dato ingresado por el usuario
     */
    public String takeInfo(String message){
        input= new Scanner(System.in);
        String message1 = "Ingrese la siguiente característica de la canción: ";
        System.out.println(message1 + message);
        return input.nextLine();
    }

    /**
     * Parsea un String a un Doble
     * @param duration el parametro a convertir (duración de la canción)
     * @return la duración en Double
     */
    public Double toDouble(String duration){
        return Double.parseDouble(duration);
    }

    /**
     * Toma toda la información dada por el usuario y la almacena en una array
     * @return array de string (nueva canción)
     */
    public String[] collectInfo(){
        for (int i = 0; i < details.length; i++) {
            information[i] = takeInfo(details[i]);
        }
        return information;
    }

    /**
     * Ciclo infinito que implementa las funciones de clase, hasta que el usuario ingrese la información correctamente
     * @param songList Lista de canciones
     * @return Nueva canción
     */
    public Song saveNewSong(List<Song> songList){
       for(;;) {
           try {
               information = collectInfo();
               LocalDate date =  LocalDate.parse(information[1]);
               Double duration = toDouble(information[2]);
               Integer id = Library.nextIndex(songList);
               return new Song(information[0], id, date, duration, information[3], information[4], information[5]);
           }catch (DateTimeParseException | NumberFormatException e){
               System.out.println("No se pudo guardar la canción\n" + "ingrese adecuadamente la información " + e);
           }
       }
    }
}
