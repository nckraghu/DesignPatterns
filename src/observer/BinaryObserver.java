package observer;

/**
 * Created by Gowtham on 17-11-2017.
 */
// An observer
@SuppressWarnings("WeakerAccess")
public class BinaryObserver implements Observer {

    private final IntState intState;
    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);

        this.intState = (IntState) subject;
    }

    @Override
    public void update() {
        int newInt = ((IntState) this.subject).getState();
        System.out.println("Binary = " + Integer.toBinaryString(newInt));
    }
}
