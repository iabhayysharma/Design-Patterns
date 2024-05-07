package DesignPatterns.Creational.FactoryDP;

public class UsedCarFactory {
    public CarCompanies getCompanyName(String UsedCarCompanyName){
        if (UsedCarCompanyName==null){
            return null;
        } else if (UsedCarCompanyName.equals("Toyota")) {
            return new Toyota();
        }else if (UsedCarCompanyName.equals("Suzuki")) {
            return new Suzuki();
        }else if (UsedCarCompanyName.equals("Mahindra")) {
            return new Mahindra();
        }
        return null;
    }
}
