package Singleton;

public class DbSigleton {
    private static DbSigleton instance = new DbSigleton();

    private DbSigleton() {

    }

    public static DbSigleton getInstance() {
        return instance;
    }
}
