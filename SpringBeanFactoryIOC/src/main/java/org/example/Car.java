package org.example;

public class Car {

    Engine engine;

    Car(){
        System.out.println("Car Constructor");
    }

    public Car(Engine engine) {
        System.out.println("Car | 1 args Constructor");
        this.engine = engine;
    }




    public void setEngine(Engine engine) {
        System.out.println("Car Setter Method...");
        this.engine = engine;
    }

    public void drive(){
        int res = engine.start();
        if(res>=1){
            System.out.println("Car started...");
        }else{
            System.out.println("Engine not Started...");
        }
    }
}
