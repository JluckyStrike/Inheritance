package com.gb.lessons;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Мурзик");
        Dog dog = new Dog("Аксель");

        cat.run(50);
        dog.swim(5);

        System.out.println("Котов: " + Cat.getCountCat() +
                           "\nСобак: " + Dog.getCountDog() +
                           "\nЖивотных всего: " + Animal.getCountAnimal());
    }
}
