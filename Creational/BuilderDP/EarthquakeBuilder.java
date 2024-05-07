package DesignPatterns.Creational.BuilderDP;

public class EarthquakeBuilder implements Builder {
private Home earthQuakeHome = new Home();
    @Override
    public void Wall() {
        this.earthQuakeHome.wall="Earthquake Wall";
    }

    @Override
    public void Floor() {
        this.earthQuakeHome.floor="Earthquake Floor";
    }

    @Override
    public void Terrace() {
        this.earthQuakeHome.terrace="Earthquake Terrace";
    }

    @Override
    public Home getFinalHouse() {

        return earthQuakeHome;
    }


}
