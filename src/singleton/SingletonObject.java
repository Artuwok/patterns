package singleton;

// Auto thread-safe singleton since its created only on class load
public class SingletonObject {

    // creating instance on loading the class
    private static final SingletonObject singleton = new SingletonObject();

    // method to get the singleton
    public SingletonObject getSingleton() {
        return singleton;
    }

    // making constructor private to prevent access
    private SingletonObject() {
    }
}
