package com.gb.lessons;

public abstract class Animal {
    private static int COUNT_ANIMAL = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        COUNT_ANIMAL++;
    }

    public static int getCountAnimal() {
        return COUNT_ANIMAL;
    }

    protected abstract void run(int s);

    protected abstract void swim(int s);
}
