package models;

import lombok.*;
import java.io.Serializable;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString

public class Album implements Serializable{

    private int id;
    private Artist artist;

    private String albumName;
    private int releaseDate;
    private double sales;
    private Genre genre;
//    private ArrayList<Genre> genres;

    public Album(int id, Artist artist, String albumName, int releaseDate, double sales, Genre genre) {
        this.id = id;
        this.artist = artist;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.sales = sales;
        this.genre = genre;
    }

    public Album() {

    }
}
