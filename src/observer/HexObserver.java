package observer;

/**
 * Created by Gowtham on 17-11-2017.
 */
// An observer
@SuppressWarnings("WeakerAccess")
public class HexObserver implements Observer {

    private Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        int newInt = ((IntState) this.subject).getState();
        System.out.println("Hex = " + Integer.toHexString(newInt).toUpperCase());
    }
}
