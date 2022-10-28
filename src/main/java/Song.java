import java.util.Date;

public abstract  class Song {
    private String name;
    private Integer id;
    private Date date;
    private Double duration;
    private  String cover;
    private  String description;

    public abstract void reproducir();

}
