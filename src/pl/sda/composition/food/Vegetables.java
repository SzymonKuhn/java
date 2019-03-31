package pl.sda.composition.food;

public abstract class Vegetables extends Food{

    public FoodType getType(){
        return FoodType.VEGETABLE;
    }

    public Vegetables(String name) {
        super(name);
    }
}
