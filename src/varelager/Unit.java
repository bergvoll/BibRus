package varelager;

/**
 * Created by andreas on 30.01.15.
 */
public class Unit {
    private double dewey;
    private int unitId;

    //antall enheter totalt i systemet
    private static int antUnits = 0;


    //konstruktør
    public Unit(double dewey, int unitId) {
        this.dewey = dewey;
        this.unitId = unitId;
        antUnits++;
    }

    //setters og getters
    public void setDewey (double dewey) {
        this.dewey = dewey;
    }

    public double getDewey() {
        return dewey;
    }

    public void setUnitId (int unitId) {
        this.unitId = unitId;
    }

    public int getUnitId() {
        return unitId;
    }

    public static int getAntUnits() {
        return antUnits;
    }
}
