package DesignPatterns.Creational.FactoryDP;

public class FactoryDesignPatternMain {
    public static void main(String Args[]) {
        //Call the factory class
        UsedCarFactory usedCarFactory = new UsedCarFactory();
        //Now get the required classes from the factory object created
        CarCompanies company1 = usedCarFactory.getCompanyName("Toyota");
        CarCompanies company2 = usedCarFactory.getCompanyName("Suzuki");
        CarCompanies company3 = usedCarFactory.getCompanyName("Mahindra");

        company1.getName();
        company2.getName();
        company3.getName();

    }
}
