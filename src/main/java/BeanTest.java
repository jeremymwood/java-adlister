import beans.Author;
import beans.Quote;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@ToString

public class BeanTest implements Serializable {

    public static void main(String[] args) {
        Author crowley = new Author(1, "Aleister", "Crowley");
        Quote mountains = new Quote("The ordinary man looking at a mountain is like an illiterate person confronted with a Greek manuscript.", crowley);

        Quote theLaw = new Quote("Do as thou wilt shall be the whole of the Law.", crowley);

//        System.out.println(mountains);
//        System.out.printf("""
//
//                %s
//
//                    --%s %s
//                """, mountains.getQuote(), mountains.getAuthor().getFirst_name(), mountains.getAuthor().getLast_name());

        System.out.println(crowley);


    }
}
