// Everything is a class or and object

public class Hello {

    // static String randomString = "String to print";
    // static final double PINUM = 3.14159265358979323846;

    public static void main(String[] args) {

        // int integerOne = 22;
        // int integerTwo = integerOne ++;
        // System.out.println(integerTwo);

        byte bigByte = 127;
        short bigSHort = 32767;
        int bigInt = 2100000000;
        long bigLong = 2100000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.14159265358979323846;

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        boolean trueOrFalse = true;
        char character = 'a';

        char randomChar = 65;
        char anotherChar = 'A';

        char escapedChars = '\n';

        String randomString = "sub fueh ufheu ";
        String anotherString = "sub fueh ufheu ";

        String byteString = Byte.toString(bigByte);
        String shortString = Short.toString(bigSHort);
        String intString = Integer.toString(bigInt);
        String longString = Long.toString(bigLong);
        String floatString = Float.toString(bigFloat);
        String doubleString = Double.toString(bigDouble);
        String booleanString = Boolean.toString(trueOrFalse);
        String charString = Character.toString(character);

        System.out.println(byteString);
        System.out.println(shortString);
        System.out.println(intString);
        System.out.println(longString);
        System.out.println(floatString);
        System.out.println(doubleString);
        System.out.println(booleanString);
        System.out.println(charString);

        System.out.println(bigByte);
        System.out.println(bigSHort);
        System.out.println(bigInt);
        System.out.println(bigLong);
        System.out.println(bigFloat);
        System.out.println(bigDouble);
        System.out.println(trueOrFalse);
        System.out.println(character);

        double aDoubleValue = 3.1456566464;
        int doubleToInt = (int) aDoubleValue;

        // parseInt("200");

        System.out.println(doubleToInt);
        System.out.println(byteString);
    }
}