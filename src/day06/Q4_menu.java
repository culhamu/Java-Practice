package day06;

public class Q4_menu {
    public static void main(String[] args) {

        String[] ulkeler={ "american", " italian", " asian", "afghani","indian"};

        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};
        for (int i = 0; i < food.length; i++) {
            System.out.println("--------"+ulkeler[i]+"-------------");
            for (int j = 0; j <food[i].length; j++) {
                System.out.println(food[i][j]);

            }

        }
    }
}
