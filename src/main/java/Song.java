import java.util.Date;

public abstract  class Song {
    private String name;
    private Integer id;
    private Date date;
    private Double duration;
    private  String cover;
    private  String description;

    public abstract void play();
    public abstract  void pause(int time);
    public abstract void next();

    public Song(String name, Integer id, Date date, Double duration, String cover, String description) {
        this.name = name;
        this.id = id;
        this.date = date;
        this.duration = duration;
        this.cover = cover;
        this.description = description;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
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
}
