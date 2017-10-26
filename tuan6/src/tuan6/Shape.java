package tuan6;

/**
 * định nghĩa 1 hình bất kì
 *
 * @author Cao Thang
 */
public class Shape {

    //màu sắc của hình
    private String color;
    //đường viền của hình
    private boolean filled;
    //vị trí của hình
    private Coordinates position;

    /**
     *
     * @return position vị trí của hinh
     */
    public Coordinates getPosition() {
        return position;
    }

    /**
     *
     * @param position vị trí
     */
    public void setPosition(Coordinates position) {
        this.position = position;
    }

    /**
     * khởi tạo mặc định cho hình được tạo
     */
    public Shape() {
        this.color = "red";
        this.filled = true;
        this.position = new Coordinates();
    }

    /**
     * khởi tạo hình có màu color, có viền filled, và tọa độ (x,y)
     *
     * @param color màu sắc
     * @param filled viền
     * @param x hoành độ
     * @param y tung độ
     */
    public Shape(String color, boolean filled, int x, int y) {
        this.color = color;
        this.filled = filled;
        this.position = new Coordinates(x, y);
    }

    /**
     * lấy màu của hình
     *
     * @return color màu sắc của hình
     */
    public String getColor() {
        return color;
    }

    /**
     * đặt màu cho hình
     *
     * @param color màu sắc
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * kiểm tra có viền hay không
     *
     * @return filled có viền hay không
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * đặt viền cho hình theo filled
     *
     * @param filled có hay không có viền
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * kiểm tra thông tin của hình
     *
     * @return thông tin hình
     */
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }

}
