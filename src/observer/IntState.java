package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gowtham on 17-11-2017.
 */
// An observable
@SuppressWarnings("WeakerAccess")
public class IntState implements Subject {

    private int state;
    private List<Observer> observers;

    public IntState() {
        state = -1;
        observers = new ArrayList<>();
    }

    public int getState() {
        return state;
    }

    public void setState(int newState) {
        state = newState;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
