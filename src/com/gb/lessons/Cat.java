package com.gb.lessons;

public class Cat extends Animal{
    private final int RUN_LENGTH = 200;
    private static int COUNT_CAT = 0;

    public Cat(String name) {
        super(name);
        COUNT_CAT++;
    }

    public static int getCountCat() {
        return COUNT_CAT;
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

    @Override
    protected void swim(int s) {
        System.out.println("Коты не умеют плавать!");
    }
}
