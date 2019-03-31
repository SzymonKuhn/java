package pl.sda.composition.food;

public abstract class Food {
    private String name;
    public abstract String getTaste();
    public abstract FoodType getType();

    public String getName() {
        return name;
    }

    public Food(String name) {
        this.name = name;
    }
}
