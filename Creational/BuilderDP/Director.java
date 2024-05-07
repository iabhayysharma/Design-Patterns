package DesignPatterns.Creational.BuilderDP;

public class Director {
    private Builder Builder;

    public Director(Builder Builder) {
        this.Builder=Builder;
    }

    public void ManageConstruction(){
        Builder.Wall();
        Builder.Floor();
        Builder.Terrace();
    }

    public Home GetFinalHouse(){
        return Builder.getFinalHouse();
    }
}
