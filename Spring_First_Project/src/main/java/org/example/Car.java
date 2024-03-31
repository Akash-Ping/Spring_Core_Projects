package org.example;

public class Car {
    Engine engine;

    Car(){
        System.out.println("Car constructor ...");
    }
    public void setEngine(Engine engine) {
        System.out.println("Car setter method ...");
        this.engine = engine;
    }
    public void drive(){
        int res = engine.start();
        if(res >= 1){
            System.out.println("Engine Started with good engine ...");
        }else {
            System.out.println("Engine not working ...");
        }
    }
}
