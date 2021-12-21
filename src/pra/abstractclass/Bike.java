package pra.abstractclass;

public abstract class Bike{
    abstract void run();
    abstract void accelerate();
    void changeGear(){
        System.out.println("change gear from 2 to 6");
    }
    public void start(){
        System.out.println("start!");
    }
    public void stop(){

    }
}
