package DesignPatterns.Creational.SingleTon;

public class DatabaseConfigurationLazyLoading {
    private static DatabaseConfigurationLazyLoading instance;
    private DatabaseConfigurationLazyLoading(){}

    public static DatabaseConfigurationLazyLoading getInstance() {
        if (instance==null){
            instance=new DatabaseConfigurationLazyLoading();
        }
        return instance;
    }
}
