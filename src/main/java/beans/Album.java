package beans;

import HelloWorld.Puppy;
import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;

@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString

public class Album implements Serializable{

    private int id;
    private Artist artist;
    private ArrayList<Artist> artists;
    private Album album_name;
    private int release_date;
    private int sales;
    private Genre genre;
    private ArrayList<Genre> genres;


    public Album() {  };


    public static void main(String[] args) {
        Artist tool = new Artist("Tool");
        System.out.println(tool);
    }

}
