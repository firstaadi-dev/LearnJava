package Primitive;

public class ByteShortLongInt {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Min = " + myMinIntValue);
        System.out.println("Max = " + myMaxIntValue);
        System.out.println("Min overflow = " + (myMinIntValue - 1));
        System.out.println("Max overflow = " + (myMaxIntValue + 1));

        int formattedInt = 2_147_321;
        System.out.println(formattedInt);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);


        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        long myLong = 200L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myLong);
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        // Type casting
        byte myNewByte = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
