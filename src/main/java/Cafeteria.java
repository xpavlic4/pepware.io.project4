import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Random;

public class Cafeteria {
    String[] mains = {"chicken", "pancakes", "fish", "pork", "salad"};
    String[] sides = {"rice", "potatos", "cuscus"};
    String[] desserts = {"muffin", "donout"};
    public static void main(String[] args) {
        new Cafeteria().run();
    }

    private void run() {
        for(int i = 0; i < 7; i++) {
            String main = random(mains);
            String side = random(sides);
            String dessert = random(desserts);

            System.out.print(  DateFormatSymbols.getInstance(Locale.ENGLISH)
                    .getWeekdays()[i]);
            System.out.println(" " +main + ", " + side + " with " + dessert);
        }

    }

    String random(String[] arrays) {
        int random = new Random().nextInt();
        int index = Math.abs(random) % arrays.length;
        return arrays[index];
    }
}
