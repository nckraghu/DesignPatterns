package observer;

/**
 * Created by Gowtham on 17-11-2017.
 */
// An observer
@SuppressWarnings("WeakerAccess")
public class OctalObserver implements Observer {

    private Subject subject;

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        int newInt = ((IntState) this.subject).getState();
        System.out.println("Octal = " + Integer.toOctalString(newInt));
    }
}
