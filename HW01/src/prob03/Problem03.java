package prob03;

class Problem03
{
    public static void main(String args[])
    {
        int a = 2147483647;
        byte b = 127;

        // prints out the binary value 10111 in decimal (23)
        System.out.println(0B10111);
        // prints out the octal value 345 in decimal (229)
        System.out.println(0345);
        // prints out the hex value 0xABCD in decimal (43981)
        System.out.println(0xABCD);
        // prints out the integer division of 1 and 3, which is 0
        System.out.println(1/3);
        // prints out the double division of 1 and 3, which is 0.3333333333333333
        System.out.println(1/3.0);
        // prints out the double division of 1 and 3, which is 0.3333333333333333
        System.out.println(1.0/3);
        // prints out the float division of 1 and 3, which is 0.33333334
        System.out.println(1.0f/3.0F);
        // prints out the scientific notation as regular double (1.23123)
        System.out.println(123.123E-2);
        // prints out a, (2147483647)
        System.out.println(a);
        // prints out b, (127)
        System.out.println(b);
        // overflow the byte by one.
        b = (byte) (b+1);
        // prints -128 due to the overflow
        System.out.println(b);
        // overflow the int by one.
        a = (int) (a+1);
        // prints out -2147483648 due to the overflow
        System.out.println(a);
        // take (128 + 127) and convert to byte
        b = (byte) ((-b)+127);
        // prints that conversion (which is -1)
        System.out.println(b);
        // take (-2147483648 + 2147483647) and convert to int
        a = (int) ((-a)+2147483647);
        // prints that conversion (which is -1)
        System.out.println(a);
        // set a and b back to initial value.
        a = 2147483647;
        b = 127;
        // take 127 + 1270 and put it into a byte
        b = (byte) (b+1270);
        // print out that number (117)
        System.out.println(b);
        // take 2147483647 + 2147483647 and put it into an int
        a = (int) (a+2147483647);
        // print out that number (-2)
        System.out.println(a);
    }
}