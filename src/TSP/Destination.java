package TSP;

public class Destination {
    private double xCoOrdinate;
    private double yCoOrdinate;

    public double getYCoordinate() {
        return this.yCoOrdinate;
    }

    public void setYCoordinate(double yCoOrdinate) {
        this.yCoOrdinate = yCoOrdinate;
    }

    public double getXCoOrdinate() {
        return this.xCoOrdinate;
    }

    public void setXCoOrdinate(double xCoOrdinate) {
        this.xCoOrdinate = xCoOrdinate;
    }

    public Destination(double xCoOrdinate, double yCoOrdinate) {
        this.xCoOrdinate = xCoOrdinate;
        this.yCoOrdinate = yCoOrdinate;
    }
}
