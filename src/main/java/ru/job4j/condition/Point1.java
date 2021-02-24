package ru.job4j.condition;

public class Point1 {
    private int x;
    private int y;

    public Point1(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point1 that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point1 a = new Point1(0, 2);
        Point1 b = new Point1(3, 6);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
