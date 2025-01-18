package myproject.LinkedList;

public class Town {

    private String townName;
    private int distance;

    public Town(String townName, int distance) {
        this.townName = townName;
        this.distance = distance;
    }


    public Town(String townName) {
        this.townName = townName;
    }

    public String getTownName() {
        return townName;
    }
    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return
                "townName='" + townName + '\'' +
                ", distance=" + distance + "Km/m " + "\n"
                ;
    }
}
