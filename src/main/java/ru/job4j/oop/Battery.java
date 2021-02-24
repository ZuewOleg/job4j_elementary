package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
            another.load = this.load + another.load;
            if (another.load > 100) {
                this.load = another.load - 100;
                another.load = 100;
            }
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(20);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}
