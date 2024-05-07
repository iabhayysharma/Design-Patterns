package DesignPatterns.Creational.BuilderDP;

public interface Builder {
    void Wall();
    void Floor();
    void Terrace();

    Home getFinalHouse();
}
