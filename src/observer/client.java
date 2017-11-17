package observer;

/**
 * Created by Gowtham on 17-11-2017.
 */
// Client program to test Observer Pattern
public class client {

    public static void main(String[] args) {

        // Create an observable
        IntState intState = new IntState();

        // Create new observers
        new BinaryObserver(intState);
        new HexObserver(intState);
        new OctalObserver(intState);

        // Change state of the observable
        System.out.println("Int = " + 15);
        intState.setState(15);
        System.out.println();
        System.out.println("Int = " + 10);
        intState.setState(10);

    }
}
