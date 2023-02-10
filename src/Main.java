import java.math.BigDecimal;

import project.restaurant.interfaces.ColorAble;
import project.restaurant.objects.Restaurant;

public class Main implements ColorAble {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("При Шестаците", new BigDecimal(420), new BigDecimal(0), 15);

        restaurant.open();*
        restaurant.work();
        restaurant.close();
        restaurant.newDay();

    }
}


