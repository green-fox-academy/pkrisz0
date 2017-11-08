package come.greenfox.pkrisz0.guardians.model;

public class Arrow {
    double speed;
    double distance;
    double time;

    public Arrow(double distance, double time) {
        this.speed = distance/time;
        this.distance = distance;
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
