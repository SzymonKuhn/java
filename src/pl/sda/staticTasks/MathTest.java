package pl.sda.staticTasks;

public class MathTest {
    public static void main (String[] args) {
        System.out.println(MathMetods.Operation.add(12,15));
        System.out.println(MathMetods.Operation.divide(12,15));
        System.out.println(MathMetods.Compare.max(12,15));
        System.out.println(MathMetods.Compare.min(12,15));
        System.out.println(MathMetods.Operation.multiply(12,3));
        System.out.println(MathMetods.Operation.substract(12,5));
        System.out.println(MathMetods.Operation.pow(4,3));
        System.out.println(MathMetods.Operation.areaCircle(8));
//        MathMetods mathMetods = new MathMetods();

    }
}
