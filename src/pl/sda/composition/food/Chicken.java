package pl.sda.composition.food;

public class Chicken extends Meat {
    public String getTaste (){
     return "Smakuje jak styropian";
    }

    public Chicken(String name) {
        super(name);
    }
}
