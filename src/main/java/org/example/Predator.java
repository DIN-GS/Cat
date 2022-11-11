package org.example;

abstract class Predator {
    private String colour;
    private int weight;

    public Predator(String colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            System.out.println("Error");;
        }
        this.weight = weight;
    }

    public abstract String sleeping();

    public abstract String hunting();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Predator predator = (Predator) o;

        if (weight != predator.weight) return false;
        return colour != null ? colour.equals(predator.colour) : predator.colour == null;
    }

    @Override
    public int hashCode() {
        int result = colour != null ? colour.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }
}
