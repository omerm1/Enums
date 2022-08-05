package com.sparta.om;

public enum Animals {
    MAMMALS("Mammals", true),
    FISH("Fish", true),
    BIRDS("Birds", false),
    AMPHIBIANS("Amphibians", true),
    INVERTEBRATES("Invertebrates", true),
    REPTILES("Reptiles", true);

    private String name;
    private Boolean waterAnimal;

    Animals(String name, Boolean waterAnimal) {
        this.name = name;
        this.waterAnimal = waterAnimal;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean waterAnimal() {
        return waterAnimal;
    }
    public void setWaterAnimal(Boolean waterAnimal) {
        this.waterAnimal = waterAnimal;
    }
    @Override    public String toString() {
        return "Animal{" +                "name='" + name + '\'' +                ", Water Animal=" + waterAnimal +                '}';
    }
}
