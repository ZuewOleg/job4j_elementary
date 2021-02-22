package ru.job4j.loop;

public class Chislo1 {
    public static void main(String[] args) {
        int n = 1;
        int i;
        boolean isComposite = false;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("число составное ");
        } else {
            System.out.println("число  простое ");
        }
    }
}
