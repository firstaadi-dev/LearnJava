package Primitive;

import java.io.IOException;

public class CharBoolean {
    public static void main(String[] args) throws IOException {
        char mySpace = '\u0C18';
        System.out.println(mySpace);

        boolean isLegal;

        int customerAge = System.in.read();

        isLegal = customerAge > 18;

        System.out.println(isLegal);

    }

}
