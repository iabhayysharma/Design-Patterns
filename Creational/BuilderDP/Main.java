package DesignPatterns.Creational.BuilderDP;

public class Main {
    public static void main(String[] args) {
        //Call the concrete Builder
        EarthquakeBuilder eb = new EarthquakeBuilder();
        //Call the Director which will handle the required concrete builder
        Director deb = new Director(eb);
        //Ask Director to manage the construction
        deb.ManageConstruction();
        //Ask Director to give the final house post construction
        Home EarthquakeHomeatend = deb.GetFinalHouse();
        //Now View the final house
        System.out.println(EarthquakeHomeatend.wall);

        FloodBuilder fb = new FloodBuilder();
        Director dfb = new Director(fb);
        dfb.ManageConstruction();
        Home FloodHomeAtEnd = dfb.GetFinalHouse();
        System.out.println(FloodHomeAtEnd.terrace);
    }
}
