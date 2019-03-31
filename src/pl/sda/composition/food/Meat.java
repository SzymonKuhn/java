package pl.sda.composition.food;

public abstract class Meat extends Food{

    public FoodType getType(){
    return FoodType.MEAT;
    }

    public Meat(String name) {
        super(name);
    }
}
