package com.sofka.taller3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que crea objetos de tipo "Song"(canción) y los añade a una lista.
 * @version 0.00.001 2022-11-21
 * @author Wendy Arcila wendy.arcilar@gmail.com
 * @since 0.00.001 2022-11-21
 */
public class Library {

    private List<Song> songList = new ArrayList<>();

    /**
     * Constructor que implementa el método createdList;
     */
    public Library() {
        createdList();
    }

    /**
     * Crea objetos de tipo "Song"(canción) y los añade a una lista.
     */
    public void createdList(){

        Song song1 = new Song("Taro",nextIndex(getSongList()),
                LocalDate.parse("2012-11-01"),5.15,"indie",
                "https://open.spotify.com/track/7EDMvrb5PA5TP0VQ8z9p82",
                "Escrita por:Gus Unger-Hamilton, Gwilym Sainsbury, Joe Newman, Thom Green"
        );
        this.songList.add(song1);
        Song song2 = new Song("Do I Wanna Know",nextIndex(getSongList()),
                LocalDate.parse("2013-07-22"),4.32,"indie",
                "https://open.spotify.com/album/78bpIziExqiI9qztvNFlQu?highlight=spotify:track:5FVd6KXrgO9B3JPmC8OPst",
                "Escrita por:Alex Turner, Arctic Monkeys"
        );
        this.songList.add(song2);

        Song song3 = new Song("Olympic Airways",nextIndex(getSongList()),
                LocalDate.parse("2008-10-06"),4.12,"indie",
                "https://open.spotify.com/album/5zUndTRjHpsB5UTsPp5MeM?highlight=spotify:track:6b9oxWgxekphG5vkz8ZpBt",
                "Escrita por: Edwin Congreave, Jack BevanJames Smith, Walter Gervers, Yannis Philippakis"
        );
        this.songList.add(song3);

        Song song4 = new Song("I Want To Break Free",nextIndex(getSongList()),
                LocalDate.parse("1984-04-02"), 4.20,"rock",
                "https://open.spotify.com/track/2AkmdLbVKS1steeZdy8H1l",
                "Escrita por: John Deacon"
        );
        this.songList.add(song4);

        Song song5 = new Song("Lounge Act",nextIndex(getSongList()),
                LocalDate.parse("1991-06-01"),3.55,"rock",
                "https://open.spotify.com/album/2UJcKiJxNryhL050F5Z1Fk",
                "Escrita por: Dave Grohl, Krist Novoselic, Kurt Cobain"
        );
        this.songList.add(song5);

        Song song6 = new Song("People Are Strange",nextIndex(getSongList()),
                LocalDate.parse("1967-08-01"),2.10,"rock",
                "https://open.spotify.com/playlist/37i9dQZF1DZ06evO19UBIk",
                "Escrita por: Jim Morrison, John Densmore, Ray Manzarek, Robby Krieger"
        );
        this.songList.add(song6);

        Song song7 = new Song("Roxanne",nextIndex(getSongList()),
                LocalDate.parse("1978-04-07"),3.11,"rock",
                "https://open.spotify.com/playlist/37i9dQZF1DZ06evO3pXaXS",
                "Escrita por: Sting"
        );
        this.songList.add(song7);

        Song song8 = new Song("You Spin Me Round",nextIndex(getSongList()),
                LocalDate.parse("1984-09-01"),3.19,"New wave",
                "https://open.spotify.com/album/5AMshCv0RIe2aO4XaQWhp4?highlight=spotify:track:1ChulFMnwxoD74Me8eX2TU",
                "Escrita por: Michael Percy, Peter Burns, Stephen Coy, Timothy Leverr"
        );
        this.songList.add(song8);

        Song song9 = new Song("Talking in Your Sleep",nextIndex(getSongList()),
                LocalDate.parse("1983-09-01"),3.54,"New wave",
                "https://open.spotify.com/album/0LMfbsue7HETT4P8Mqxbvg?highlight=spotify:track:7fRvtXvJMpGfTLdF0M09a1",
                "Escrita por: George Canler, Jimmy Marinos, Michael Skill, Peter Solley, Wally Palmar"
        );
        this.songList.add(song9);

        Song song10 = new Song("Maneater",nextIndex(getSongList()),
                LocalDate.parse("1982-10-31"),4.33,"New wave",
                "https://open.spotify.com/track/4aKIs5t9TqP59btlCGPrgw",
                "Escrita por: Daryl Hall, John Oates, Sara Allen"
        );
        this.songList.add(song10);
    }

    /**
     * Añade una nueva canción a la lista de canciones.
     * @param song Una nueva canción de tipo Song
     */
    public void addSong(Song song){
        this.songList.add(song);
    }

    /**
     * Toma el ID del último objeto de la lista que recibe
     * @param list Lista de canciones
     * @return el ID para la siguiente canción
     */
    public static int nextIndex(List<Song> list){
        if(!list.isEmpty()) {
            return list.get(list.size()-1).getId() + 1;
        }return 1;
    }

    /**
     * Obtiene la lista de canciones
     * @return la lista de canciones
     */
    public List<Song> getSongList() {
        return songList;
    }

    /**
     * Devuelve la lista de canciones a guardar
     * @param songList lista de canciones.
     */
    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }
}
