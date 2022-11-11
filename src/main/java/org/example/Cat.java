package org.example;

import java.util.Objects;

public class Cat extends Predator{
    private String breed;

    public Cat(String colour, int weight, String breed) {
        super(colour, weight);
        this.breed = breed;
    }

    @Override
    public String sleeping() {
        System.out.println("Cat is sleeping");
        return "Cat is sleeping";
    }

    @Override
    public String hunting() {
        System.out.println("Cat is hunting");
        return "Cat is hunting";
    }

    public String jumping(){
        System.out.println("TUguduktuguduk");
        return "TUguduktuguduk";
    }

    public String whatIsCatDoing(Days day){
        switch (day){
            case Monday:
            case Wednesday:
            case Friday:
                return sleeping();

            case Tuesday:
            case Thursday:
            case Saturday:
                return hunting();


            case Sunday:
                return jumping();

            default:
                System.out.println("Hmm I don't know where is my cat and what it is doing");
                return "Hmm I don't know where is my cat and what it is doing";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;


        return Objects.equals(breed, cat.breed)  && super.equals(o);
    }

    @Override
    public int hashCode() {
        return breed != null ? breed.hashCode() : 0;
    }
}
