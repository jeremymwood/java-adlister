package models;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;

@NoArgsConstructor
@Getter
@Setter
@ToString

public class Quote implements Serializable {

    private String quote;

    private Author author;

    private ArrayList<Quote> quotes;

    public Quote(String quote) {
        this.quote = quote;
    }

    public Quote(String quote, Author author) {
        this.quote = quote;
        this.author = author;
    }

    public Quote(Author author, ArrayList<Quote> quotes) {
        this.author = author;
        this.quotes = quotes;
    }
    //    public Author(int id, String first_name, String last_name, Quote quote) {
//        this.id = id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.quote = quote;
//    }
//
//    public Author(int id, String first_name, String last_name, ArrayList<Quote> quotes) {
//        this.id = id;
//        this.first_name = first_name;
//        this.last_name = last_name;
//        this.quotes = quotes;
//    }

}
