public class Food {
    private FoodType type;
    private Size size;
    private double price;

    public Food(FoodType type, Size size, double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        this.type = type;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public FoodType getType() {
        return type;
    }

    public Size getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
