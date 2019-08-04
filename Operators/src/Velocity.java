/**
 * Java program used for calculate velocity.
 *
 * @author solcanm
 * @version 1.0
 * @since 2019-08-04
 */
public class Velocity {

    private int distance; // [m]
    private int time; // [s]

    public int getDistance() {
        return distance;
    }

    void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    void setTime(int time) {
        this.time = time;
    }

    String getVelocity() {
        return (this.distance / 1000) / (this.time / 3600) + " km/h";
    }
}
