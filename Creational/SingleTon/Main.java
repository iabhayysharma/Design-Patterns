package DesignPatterns.Creational.SingleTon;

public class Main {
    public static void main(String[] Args) {

        //This function prints the Instance of the singleton class

        System.out.println("Early Loading Singleton");
        //Notice the instance name is same on calling again and again
        System.out.println(EarlyLoading.getDbConfigInstance());
        System.out.println(EarlyLoading.getDbConfigInstance());
        System.out.println(EarlyLoading.getDbConfigInstance());

        System.out.println("Lazy Loading Singleton");
        //Notice the instance name is same on calling again and again
        System.out.println(LazyLoading.getInstance());
        System.out.println(LazyLoading.getInstance());
        System.out.println(LazyLoading.getInstance());

        System.out.println("Enum Singleton");
        //Notice the hashcode is same on calling again and again
        System.out.println(Enum.INSTANCE.hashCode());
        System.out.println(Enum.INSTANCE.hashCode());
        System.out.println(Enum.INSTANCE.hashCode());


    }
}
