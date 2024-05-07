package DesignPatterns.Creational.SingleTon;

public class DatabaseConfiguration {

    private static DatabaseConfiguration dbConfigInstance= new DatabaseConfiguration();
    private DatabaseConfiguration(){}
    public static DatabaseConfiguration getDbConfigInstance() {
        return dbConfigInstance;
    }

}
