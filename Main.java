import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // On créer un dictionnaire avec des items et leur quantité
        Map<Food, Quantity> items = new HashMap<>();

        Food couscous = new Food(FoodType.PLAT, Size.MOYEN, 15.00);
        Food coca = new Food(FoodType.BOISSON, Size.MOYEN, 3.00);
        Food coffee = new Food(FoodType.CAFE, Size.PETIT, 1.50);

        items.put(couscous, new Quantity(12));
        items.put(coca, new Quantity(1));
        items.put(coffee, new Quantity(1));  // 1 café donc réduction de 1€ (normalement)

        Order order = new Order(items);

        double totalPrice = order.getTotalPrice();

        System.out.println("Prix à payer : " + totalPrice + "€");

        //Améliorable, ajouter des tests unitaires
        //Ajouter l'info de discount si type = CAFE ailleurs que dans le dur du calcul Order.getTotalPrice()
        //Créer une classe Combo pour gérer les discount selon les formules
        //Cafe est un type dans le enum FoodType, Mais ne devrait pas, car c'est un type de boisson et non pas un type d'item
        //Food devrait être renommé Item ou Article/product

    }
}
