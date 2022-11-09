import java.time.LocalDate;

public class Song {
    private String name;
    private Integer id;
    private LocalDate date;
    private Double duration;
    private String genre;
    private  String cover;
    private  String description;


    protected Song(String name, Integer id, LocalDate date, Double duration, String cover, String description) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.cover = cover;
        this.description = description;
    }
    public Song() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  id+", "+ name + ", " + date + ", " + duration + ", " + genre + ", " + cover + ", " + description;
    }
}
