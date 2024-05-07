package DesignPatterns.Creational.BuilderDP;

public class FloodBuilder implements Builder {
private Home floodHome=new Home();
    @Override
    public void Wall() {
        this.floodHome.wall="Flood Wall";
    }

    @Override
    public void Floor() {
        this.floodHome.floor="Flood Floor";
    }

    @Override
    public void Terrace() {
        this.floodHome.terrace="Flood Terrace";
    }

    @Override
    public Home getFinalHouse() {

        return floodHome;
    }
}
