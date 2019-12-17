package design.observer;


/**
 * 被观察接口
 */
public interface Observable {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String context);

}
