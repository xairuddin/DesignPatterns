package strategy;

import strategy.behaviour.FlyWithWings;
import strategy.behaviour.NoFlyWay;
import strategy.behaviour.SimpleQuack;

public class DuckMain {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehaviour(new NoFlyWay());
        mallardDuck.setQuackBehaviour(new SimpleQuack());
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
