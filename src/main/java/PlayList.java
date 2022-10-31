public class PlayList {

    public String[] selectSong(String[] songs, Integer[] choice){
        String[] newList = new String[0];
        for (int i = 0; i <songs.length; i++) {
            for (int j = 0; j < choice.length; j++) {
                if(choice[i]==j+1){
                    newList[i]= songs[i];
                }
            }
        }return newList;
    }

    public void choiceName(){}

    public void selectPlayList(){}
}
