package pra.abstractclass;

public class Honda extends Bike{

    @Override
    void run(){
        System.out.println("run honda!!");
    }

    @Override
    void accelerate() {
        System.out.println("accelerate honda 2 to 5");
    }

    @Override
    void changeGear(){
        System.out.println("gear of honda: ");
    }

    @Override
    public void start() {
        super.start();
    }
}
