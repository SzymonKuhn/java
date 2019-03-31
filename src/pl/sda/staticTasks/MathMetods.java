package pl.sda.staticTasks;

public class MathMetods {
    static final double PI = 3.14;

    static class Operation {
        public static int add (int num1, int num2) {
            return num1 + num2;
        }

        public static int substract (int num1, int num2) {
            return num1 - num2;
        }

        public static int multiply (int num1, int num2) {
            return num1 * num2;
        }

        public static int divide (int num1, int num2) {
            return num1 / num2;
        }

        public static int pow (int num1, int num2) {
            int result=0;
            if (num2 == 0) return result;
            result = num1;
            for (int i = 1; i<num2; i++) {
                result = result * num1;
            }
            return result;
        }

        public static double areaCircle (int r) {
            return r * r * PI;
        }
    }

    static class Compare {
        public static int min (int num1, int num2) {
            if (num1 < num2) return num1;
            else return num2;
            //            return ( num1 < num2) ? num1 : num2;
        }

        public static int max (int num1, int num2) {
            if (num1 > num2) return num1;
            else return num2;
        }



    }

    private MathMetods(){};

}
