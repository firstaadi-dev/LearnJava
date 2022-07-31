package Primitive;

public class FloatDouble {
    public static void main(String[] args) {
        double myMaxDouble = Double.MAX_VALUE;
        double myMinDouble = Double.MIN_VALUE;
        System.out.println(myMaxDouble);
        System.out.println(myMinDouble);

        float myMaxFloat = Float.MAX_VALUE;
        float myMinFloat = Float.MIN_VALUE;
        System.out.println(myMaxFloat);
        System.out.println(myMinFloat);

        int myIntValue = 5;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue / 3.00000382321321d);
    }
}
