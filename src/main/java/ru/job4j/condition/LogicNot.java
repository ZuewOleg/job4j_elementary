package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num){return num % 2 == 0;}
    public static boolean isPositive(int num){
        return num > 0;
    }
    public static boolean notEven(int num){
        return !isEven(num);
    }
    public static boolean notPositive(int num){
        return !isPositive(num);
    }
    public static boolean notEvenAndPositive(int num){
        return notEven(num) && isPositive(num);
    }
    public static boolean evenOrNotPositive(int num){
        return isEven(num) && notPositive(num);
    }

    public static void main(String[] args) {
        boolean result1 = LogicNot.isEven(2);
        System.out.println(result1);
        boolean result2 = LogicNot.isPositive(-2);
        System.out.println(result2);
        boolean result3 = LogicNot.notEven(7);
        System.out.println(result3);
        boolean result4 = LogicNot.notPositive(4);
        System.out.println(result4);
        boolean result5 = LogicNot.notEvenAndPositive(1);
        System.out.println(result5);
        boolean result6 = LogicNot.evenOrNotPositive(-2);
        System.out.println(result6);
    }
}