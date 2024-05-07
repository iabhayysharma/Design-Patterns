package DesignPatterns.Creational.SingleTon;

public class Main {
    public static void main(String[] Args) {
        DatabaseConfiguration databaseConfiguration=DatabaseConfiguration.getDbConfigInstance();
        System.out.println(databaseConfiguration.getDbConfigInstance());
        System.out.println(databaseConfiguration.getDbConfigInstance());
        System.out.println(databaseConfiguration.getDbConfigInstance());
        System.out.println(DBEnum.INSTANCE.hashCode());
        System.out.println(DBEnum.INSTANCE.hashCode());
        System.out.println(DBEnum.INSTANCE.hashCode());

        DatabaseConfigurationLazyLoading databaseConfigurationLazyLoading=DatabaseConfigurationLazyLoading.getInstance();
        System.out.println(databaseConfigurationLazyLoading);
        System.out.println(databaseConfigurationLazyLoading);
    }
}
