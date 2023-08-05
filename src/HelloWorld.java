public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world");

        int myFavoriteNumber = 1738;
        String myString = "a few words";
        System.out.println(myFavoriteNumber +" "+ myString);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int s = 5;
        System.out.println(++s);
        System.out.println(s);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // the commented out code aboce will result in an error due to the string not being able to be casted inside the integer

        // example on how to use shorthand int myNumber = 12 + 12 * 2;
        // myNumber += 9;
        //// equivalent to
        //myNumber = myNumber + 9;
        int num = 4;
        num += 5;

        int numX = 3;
        int numY = 4;
        numY *= numX;

        int xNum = 10;
        int yNum = 2;
        xNum /= yNum;
        yNum -= xNum;

        int maxValue = Integer.MAX_VALUE;
        int overflowedValue = maxValue + 1; // This will be -2147483648 (Integer.MIN_VALUE)

        int minValue = Integer.MIN_VALUE;
        int underflowedValue = minValue - 1; // This will be 2147483647 (Integer.MAX_VALUE)

        float maxValues = Float.MAX_VALUE;
        float overflowedValues = maxValues * 2; // This will be Infinity

        float minValues = Float.MIN_VALUE;
        float underflowedValues = minValues / 2; // This will be 0.0


    }
}
