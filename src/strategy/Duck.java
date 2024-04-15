package strategy;

import strategy.behaviour.FlyBehaviour;
import strategy.behaviour.QuackBehaviour;

public abstract class Duck {
    private String head;
    private String body;
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public abstract void display();
    public void performFly(){
flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
