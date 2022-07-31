package Primitive;

public class FloatDoubleChallenge {


    public static void main(String[] args) {
        double myPound = 3.22123;

        double myKilo = FloatDoubleChallenge.poundToKilo(myPound);

        System.out.println(myPound + " pound = " + myKilo + " kg");

    }

    public static double poundToKilo(double pound) {
        return pound * 0.45359237d;
    }

}

