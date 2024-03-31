package org.example;

public class PetrolEngine implements Engine{

    PetrolEngine(){
        System.out.println("Petrol Engine Constructor ...");
    }
    @Override
    public int start() {
        System.out.println("Petrol engine Start ...");
        return 1;
    }
}
