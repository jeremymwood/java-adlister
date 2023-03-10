import models.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString

public class BeanTest {
    public static void main(String[] args) {

        Album whiteAlbum = new Album();
        whiteAlbum.setId(1);
//        whiteAlbum.setArtist("The Beatles");
        whiteAlbum.setAlbumName("The White Album");
        System.out.println(whiteAlbum);

        Artist tool = new Artist("Tool");
        Genre progMetal = new Genre("Prog Metal");
//        name lateralus = new name("Lateralus");
        Album lateralus = new Album(1, tool, "Lateralus",2001, 20000000, progMetal);
        System.out.println(lateralus);


        Author crowley = new Author(1, "Aleister", "Crowley");
        Quote mountains = new Quote("The ordinary man looking at a mountain is like an illiterate person confronted with a Greek manuscript.", crowley);

        Quote theLaw = new Quote("Do as thou wilt shall be the whole of the Law.", crowley);

        Quote quote = new Quote();
        quote.setAuthor(crowley);
        quote.setQuote("Do as thou wilt shall be the whole of the Law.");

//        for each loop to iterate over array list
//        need to set ids to loop over

//        Quote

//        System.out.println(mountains);
//        System.out.printf("""
//
//                %s
//
//                    --%s %s
//                """, mountains.getQuote(), mountains.getAuthor().getFirst_name(), mountains.getAuthor().getLast_name());

        System.out.println(crowley);

//        dao lecture notes
//        or gateways, connect database to beans
//        can model this with a text file?
//        dao implements CRUD


    }
}
