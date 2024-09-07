/*
Short Description:  This program will create three circles, one of a radius of 10, one of a radius of 5, and another
                    of a radius of 5.  The program will utilize these three objects to prove the correct implementation
                    of the compareTo and equals methods in the Circle class.
Author:  Brian Wiatrek
Date:  September 7, 2024
*/
public class Main {
    public static void main(String[] args) {

        Circle large = new Circle(10.0);
        Circle small = new Circle(5.0);
        Circle same = new Circle(5.0);
        System.out.println(large.compareTo(small));
        System.out.println(small.compareTo(large));
        System.out.println(small.compareTo(same));
        System.out.println(large.equals(small));
        System.out.println(small.equals(same));
    }
}