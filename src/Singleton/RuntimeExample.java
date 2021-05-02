package Singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        System.out.println(runtime);

        Runtime runtime1 = Runtime.getRuntime();
        runtime1.gc();
        System.out.println(runtime1);

        if(runtime == runtime1)
            System.out.println("Same instance");

    }
}
