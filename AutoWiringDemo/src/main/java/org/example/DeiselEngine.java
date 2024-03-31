package org.example;

public class DeiselEngine implements Engine{

    DeiselEngine(){
        System.out.println("Deisel Engine Constructor");
    }
    @Override
    public int start() {
        System.out.println("Deisel Engine Start ...");
        return 1;
    }
}
