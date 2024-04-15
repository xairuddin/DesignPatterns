package strategy.behaviour;

public class SimpleQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I am just quack!");
    }
}
