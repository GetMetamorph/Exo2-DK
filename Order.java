import java.util.Map;
import java.util.HashMap;

public class Order {
    private Map<Food, Quantity> foods;

    public Order(Map<Food, Quantity> foods) {
        this.foods = foods;
    }

    private double calculateComboPrice(double mainCoursePrice, double drinkPrice, double dessertPrice, boolean hasCoffee) {
        double comboPrice = mainCoursePrice + drinkPrice + dessertPrice;
        if (hasCoffee) {
            comboPrice -= 1;
        }
        return comboPrice;
    }

    public double getTotalPrice() {

        boolean hasCoffee = false;
        double drinkPrice = 0;
        double mainCoursePrice = 0;
        double dessertPrice = 0;
        double total = 0;

        for (Map.Entry<Food, Quantity> entry : foods.entrySet()) {
            Food food = entry.getKey();
            Quantity quantity = entry.getValue();

            switch (food.getType()) {
                case BOISSON:
                    drinkPrice += food.getPrice() * quantity.getQuantity();
                case PLAT:
                    mainCoursePrice = food.getPrice() * quantity.getQuantity();
                    break;
                case DESSERT:
                    dessertPrice += food.getPrice() * quantity.getQuantity();
                    break;
                case CAFE:
                    hasCoffee = true;
                    break;
            }
        }

        total += mainCoursePrice + drinkPrice + dessertPrice;

        if (!hasCoffee) {
            total += 1;
        }
        return total;
    }

}
