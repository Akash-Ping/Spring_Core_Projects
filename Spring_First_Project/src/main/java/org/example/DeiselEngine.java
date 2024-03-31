package org.example;

public class DeiselEngine implements Engine{
    DeiselEngine(){
        System.out.println("Deisel Engine Constructor ...");
    }

    @Override
    public int start() {
        System.out.println("Diesel engine start ...");
        return 1;
    }
}
