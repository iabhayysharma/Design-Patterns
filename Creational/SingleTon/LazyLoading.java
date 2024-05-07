package DesignPatterns.Creational.SingleTon;

public class LazyLoading {
    private static LazyLoading instance;
    private LazyLoading(){}

    public static LazyLoading getInstance() {
        if (instance==null){
            instance=new LazyLoading(); //making the single instance only when getInstance is called
        }
        return instance;
    }
}
