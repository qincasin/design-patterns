package design.observer;

import java.util.Vector;

/**
 * 具体被观察实现类
 */
public class HanFeiZi implements IHanFeiZi, Observable {

    private Vector<Observer> observers = new Vector<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String context) {

        for (Observer observer : observers) {
            observer.update(context);
        }

    }

    public void haveBreakfast() {
        System.out.println("韩非子： 开始吃饭了 ....");
        this.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.notifyObservers("韩非子在娱乐");
    }
}
