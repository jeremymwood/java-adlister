package beans;

import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString

public class Album implements Serializable{

    private int id;
    private Artist artist;
//    private ArrayList<Artist> artists;

//    private String name;
    private int release_date;
    private int sales;
    private Genre genre;
//    private ArrayList<Genre> genres;

    public Album(int id, Artist artist, int release_date, int sales, Genre genre) {
        this.id = id;
        this.artist = artist;
//        this.name = name;
        this.release_date = release_date;
        this.sales = sales;
        this.genre = genre;
    }

    public static void main(String[] args) {
        Artist tool = new Artist("Tool");
        Genre progMetal = new Genre("Prog Metal");
//        name lateralus = new name("Lateralus");
        Album lateralus = new Album(1, tool, 2001, 20000000, progMetal);
        System.out.println(lateralus);
    }

}
