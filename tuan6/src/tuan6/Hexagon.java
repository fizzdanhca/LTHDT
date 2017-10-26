package tuan6;

/**
 * đại diện cho hình lục giác đều
 *
 * @author Cao Thang
 */
public class Hexagon {

    private Coordinates center = new Coordinates();
    private int radius;

    public Coordinates getCenter() {
        return center;
    }

    public Hexagon() {
        this.radius = 1;
    }

    public Hexagon(int radius) {
        this.radius = radius;
    }

    public void setCenter(Coordinates center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
