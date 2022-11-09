import java.time.Year;
import java.util.Comparator;
import java.util.List;

public class OrderPlayList implements IOrder {

    @Override
    public void findGenre(List<Song> songList, String genre) {
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getGenre().equals(genre)) {
                System.out.println(songList.get(i).getGenre() + songList.get(i).toString());
            }
        }
    }

    @Override
    public void findYear(List<Song> songList, Year yearToFind) {
        Year year;
        for (int i = 0; i < songList.size(); i++) {
            year= Year.of(songList.get(i).getDate().getYear());
            if (year.equals(yearToFind)) {
                System.out.println(songList.get(i).toString());
            }
        }
    }

    @Override
    public void ascendantDuration(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDuration));
            System.out.println(songList.get(i).toString());
        }
    }

    @Override
    public void descendentDuration(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDuration).reversed());
            System.out.println(songList.get(i).toString());
        }
    }

    @Override
    public void ascendantDate(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDate));
            System.out.println(songList.get(i).toString());
        }
    }

    @Override
    public void descendentDate(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getDate).reversed());
            System.out.println(songList.get(i).toString());
        }
    }


    @Override
    public void normalOrder(List<Song> songList) {
        for (int i = 0; i < songList.size(); i++) {
            songList.sort(Comparator.comparing(Song::getId));
            System.out.println(songList.get(i).toString());
        }
    }

}
