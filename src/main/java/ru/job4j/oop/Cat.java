package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;
    private String action;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void doIt(String did) {
        this.action = did;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.action);
        System.out.println(this.food);
    }

    public static void main(String[] args) {
        System.out.println("Котёнок по имени:");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.doIt("съел");
        gav.eat("котлету");
        gav.show();
        System.out.println("Большой черный кот");
        Cat black = new Cat();
        black.giveNick("(его имя история умалчивает)");
        black.doIt("съел");
        black.eat("рыбу");
        black.show();
    }
}
