package DesignPatterns.Creational.SingleTon;

public class EarlyLoading {

    private static EarlyLoading dbConfigInstance= new EarlyLoading();
    private EarlyLoading(){}
    public static EarlyLoading getDbConfigInstance() {
        return dbConfigInstance;
    }

}
