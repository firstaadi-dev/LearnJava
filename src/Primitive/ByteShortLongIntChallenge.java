package Primitive;

public class ByteShortLongIntChallenge {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;

        int myInt = 90000;
        long myLong = 50_000L + (myByte + myShort + myInt) * 10L;

        System.out.println(myLong);
    }
}
