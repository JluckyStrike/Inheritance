package com.gb.lessons;

public class Dog extends Animal{
    private final int RUN_LENGTH = 500;
    private final int SWIM_LENGTH = 10;
    private static int COUNT_DOG = 0;

    public Dog(String name) {
        super(name);
        COUNT_DOG++;
    }

    @Override
    protected void run(int s) {
        if (s >= 0 && s <= RUN_LENGTH){
            System.out.println(name + " пробежал: " + s + " м.");
        }else if (s > RUN_LENGTH){
            System.out.println("Кот не способен пробежать такое расстояние");
        }else{
            System.out.println("Вы ввели некорректное расстояние");
        }
    }

    public static int getCountDog() {
        return COUNT_DOG;
    }

    @Override
    protected void swim(int s) {
        if (s >= 0 && s <= SWIM_LENGTH){
            System.out.println(name + " проплыл: " + s + " м.");
        }else if (s > SWIM_LENGTH){
            System.out.println("Кот не способен пробежать такое расстояние");
        }else{
            System.out.println("Вы ввели некорректное расстояние");
        }
    }
}
