package tuan6;

/**
 * định nghĩa hình chữ nhật
 *
 * @author Cao Thang
 */
public class Rectangle extends Shape {

    // chiều rộng hình chữ nhật
    private double width;
    // chiều dài hình chữ nhật
    private double length;

    /**
     * khởi tạo hình chữ nhật có chiều dài 1.0 chiều rộng 1.0
     */
    Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    /**
     * khởi tạo hình chữ nhật chiều dài length, chiều rộng width
     *
     * @param width chiều dài
     * @param length chiều rộng
     */
    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    /**
     * khởi tạo hình chữ nhật chiều dài length, chiều rộng width, màu color,
     * viền filled
     *
     * @param width chiều rộng
     * @param length chiều dài
     * @param color màu sắc
     * @param filled viền
     */
    Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.setColor(color);
        this.setFilled(filled);
    }

    /**
     * lấy ra chiều rộng
     *
     * @return chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * cài chiều rộng
     *
     * @param width chiều rộng
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * lấy ra chiều dài
     *
     * @return length chiều dài
     */
    public double getLength() {
        return length;
    }

    /**
     * cài chiều dài
     *
     * @param length chiều dài
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * lấy ra diện tích
     *
     * @return diện tích
     */
    public double getArea() {
        return width * length;
    }

    /**
     * lấy ra chu vi
     *
     * @return chu vi
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * kiểm tra thông tin của hình
     *
     * @return thông tin hình
     */
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", color=" + getColor() + ", filled=" + isFilled() + '}';
    }

    /**
     * so sánh 2 hình chữ nhật
     *
     * @param rectangle hình chữ nhật khác
     * @return trùng hay không trùng
     */
    public boolean equal(Rectangle rectangle) {
        if (this.length == rectangle.length && this.width == rectangle.width && this.getPosition().equal(rectangle.getPosition())) {
            return true;
        }
        return false;
    }
}
