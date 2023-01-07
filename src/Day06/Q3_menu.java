package Day06;

public class Q3_menu {
    public static void main(String[] args) {
      /*  steak
        hot dog
        cheeseburger
                -----------------------
                pizza
        pasta
                canoli
        -----------------------
                sushi
        ramen
        fried rice
        dumplings
                -----------------------
                kebab
        manto
                -----------------------
                beriyani
        masal
                curry
        chicken tikka masala
                -----------------------
 */
        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};
        for (String[] ulkeler:food) {
            for (String yemek:ulkeler) {
                System.out.println(yemek);

            }
            System.out.println("-------------------------");

        }

    }
}
