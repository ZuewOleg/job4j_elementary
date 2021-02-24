package ru.job4j.oop;

public class Dog {
    public String sound() {
        String voice = "gaw - gaw";
        return voice;
    }
    public static void main(String[] args) {
        Dog polkan = new Dog();
        String say = polkan.sound();
        System.out.println("Polkan says " + say);
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
    }
}
