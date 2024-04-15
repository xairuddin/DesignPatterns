package strategy.behaviour;

public class NoFlyWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
