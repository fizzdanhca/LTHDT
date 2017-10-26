package tuan6;

/**
 * định nghĩa tọa độ
 *
 * @author Cao Thang
 */
public class Coordinates {

    //hoành độ
    private int x;
    //tung độ
    private int y;

    Coordinates() {
        x = 0;
        y = 0;
    }

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return x hoành độ
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @param x hoành độ
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @return y tung độ
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @param y tung độ
     */
    public void setY(int y) {
        this.y = y;
    }

    boolean equal(Coordinates a) {
        if (x == a.getX() && y == a.getY()) {
            return true;

        }
        return false;
    }
}
