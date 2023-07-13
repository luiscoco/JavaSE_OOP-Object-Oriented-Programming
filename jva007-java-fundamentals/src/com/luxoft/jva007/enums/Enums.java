package com.luxoft.jva007.enums;

public class Enums {

    public static enum DogSize {
        SMALL(15,"Yip"), MIDDLE(30,"Gav"), BIG(60,"Woff");
        public int size;
        public String sound;
        
        DogSize(int size, String sound) {
            this.size = size;
            this.sound = sound;
        }
    }

    public static class Dog {
        String name;
        DogSize dogSize = DogSize.MIDDLE;
        
        String getBarkSound() {
            return dogSize.sound;
        }
        
        public Dog(String name, DogSize dogSize) {
            this.name = name;
            this.dogSize = dogSize;
        }
    }
    
    static void printDogSizes() {
        for (DogSize dogSize: DogSize.values()) {
            System.out.println("dog size name = " + dogSize.name());
            System.out.println("effective size = " + dogSize.size);
            System.out.println("sound = " + dogSize.sound);
        }
    }

    public static void main(String[] args) {
        printDogSizes();
        
        Dog myDog = new Dog("Azorel", DogSize.SMALL);
        System.out.println(myDog.getBarkSound());
    }
}

