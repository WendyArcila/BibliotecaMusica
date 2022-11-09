import java.time.Year;
import java.util.List;

public interface IOrder {
    public void findGenre(List<Song> songList, String genre);
    public void findYear(List<Song> songList, Year year);
    public void ascendantDuration(List<Song> songList);

    public void descendentDuration(List<Song> songList);

    public void ascendantDate(List<Song> songList);

    public void descendentDate(List<Song> songList);
    public void normalOrder(List<Song> songList);
}
