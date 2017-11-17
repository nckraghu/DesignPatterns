package observer;

/**
 * Created by Gowtham on 17-11-2017.
 */
// Classes implementing this interface are observable.
public interface Subject {
    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();
}
