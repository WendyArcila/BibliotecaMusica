import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShowPlayList {

    final String CHOICESONGS="Escriba el número de las canciones que desean que sean parte de su playList nueva" +
            "separado por un ', ' ";
    final String CHOICENAME="Ingrese el nombre de su nueva lista";
    String namePlaylist;
    Boolean isPrivate;
    Scanner input;

    public String[] selectSongs(){
        input= new Scanner(System.in);
        System.out.println(CHOICESONGS);
        return input.nextLine().split(", ");
    }
    public Integer[] parseIntChoice(){
        String[] choice = selectSongs();
        Integer[] choiceInt = new Integer[choice.length];
        for (int i = 0; i < choice.length; i++) {
            choiceInt[i]= Integer.parseInt(choice[i]);
        }
        Arrays.sort(choiceInt);
        return choiceInt;
    }

    //puede ir un control de errores si eligen una canción que no está o no eligen nada
    public List<Song> compareSelectSong(List<Song> songList, Integer[] choice){
        List<Song> newList = new ArrayList<>();
        for (int i = 0; i < songList.size(); i++) {
            boolean flag = songList.get(i).getId().equals(choice[i]);
            System.out.println(flag);
        }return newList;
    }

    public String choiceName(){
        Scanner input= new Scanner(System.in);
        System.out.println(CHOICENAME);
        return input.nextLine();
    }

    public void selectPlayList(){

    }
}
