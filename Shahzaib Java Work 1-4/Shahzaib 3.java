class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //Arithmetic Operators
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("x++ = " + (x++));
        System.out.println("++x = " + (++x));
        System.out.println("x-- = " + (x--));
        System.out.println("--x = " + (--x));

        //Assignment Operators
        x += 5;
        System.out.println("x += 5 = " + x);
        x -= 5;
        System.out.println("x -= 5 = " + x);
        x *= 5;
        System.out.println("x *= 5 = " + x);
        x /= 5;
        System.out.println("x /= 5 = " + x);
        x %= 5;
        System.out.println("x %= 5 = " + x);

        //Bitwise Operators
        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("~x = " + (~x));
        System.out.println("x << 2 = " + (x << 2));
        System.out.println("x >> 2 = " + (x >> 2));
        System.out.println("x >>> 2 = " + (x >>> 2));

        //Logical Operators
        System.out.println("(x < 10) && (y > 5) = " + ((x < 10) && (y > 5)));
        System.out.println("(x < 10) || (y > 5) = " + ((x < 10) || (y > 5)));
        System.out.println("!(x < 10) = " + (!(x < 10)));

        //Comparison Operators
        System.out.println("(x == y) = " + (x == y));
        System.out.println("(x != y) = " + (x != y));
        System.out.println("(x > y) = " + (x > y));
        System.out.println("(x < y) = " + (x < y));
        System.out.println("(x >= y) = " + (x >= y));
        System.out.println("(x <= y) = " + (x <= y));

        //Ternary Operator
        int min = (x < y) ? x : y;
        System.out.println("min = " + min);

    }

}