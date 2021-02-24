package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] second) {
        array = second;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] second = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(second);
        reduce.print();
    }
}
