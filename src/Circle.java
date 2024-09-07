/*
Short Description:  This class was modified from the Liang text to implement the compareTo and equals methods.
Author:  Brian Wiatrek
Date:  Sept 7, 2024
*/
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
                  String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Print the circle info
     */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    /**
     * This method compares two Circle objects; it utilizes the Double.compare method to
     * return 1 if this.radius is larger than o.radius
     * return 0 if this is the same radius as o
     * return -1 if this is smaller than o.radius
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Circle o){
        return Double.compare(getRadius(), o.getRadius());
    }

    /**
     * This method overrides the equals object method
     * This method returns:
     * true if the object is being compared to itself
     * false if the object is not an instance of circle
     * true if the object has the same radius as this
     * false if the object does not have the same radius as this
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof Circle)) return false;
        return this.getRadius() == ((Circle) o).getRadius();
    }
}