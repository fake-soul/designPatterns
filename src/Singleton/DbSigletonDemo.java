package Singleton;

public class DbSigletonDemo {
    public static void main(String[] args) {
        DbSigleton dbSigleton = DbSigleton.getInstance();
        System.out.println(dbSigleton);
    }
}
