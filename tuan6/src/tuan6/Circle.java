package tuan6;

/**
 * Lớp này định nghĩa hình tròn
 *
 * @author Cao Thang
 */
public class Circle extends Shape {

    // hằng số pi
    final double PI = 3.14;
    // bán kính hình tròn
    private double radius;

    /**
     * khởi tạo hình tròn có bán kính bằng 1.0
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     * khởi tạo hình tròn có bán kính bằng radius
     *
     * @param radius bán kính
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * khởi tạo hình tròn có bán kính bằng radius, màu color, viền filled
     *
     * @param radius bán kính
     * @param color màu sắc
     * @param filled có viền hay không
     */
    public Circle(double radius, String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        this.radius = radius;
    }

    /**
     * lấy bán kính của hình tròn
     *
     * @return bán kính hình tròn
     */
    public double getRadius() {
        return radius;
    }

    /**
     * cài bán kính cho hình tròn
     *
     * @param radius bán kính
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * lấy diện tích hình tròn
     *
     * @return diện tích hình tròn
     */
    public double getArea() {
        return 2 * radius * PI;
    }

    /**
     * lấy chu vi hình tròn
     *
     * @return chu vi hình tròn
     */
    public double getPerimeter() {
        return radius * radius * PI;
    }

    /**
     * kiểm tra thông tin của hình
     *
     * @return thông tin hình
     */
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + getColor() + ", filled=" + isFilled() + '}';
    }
    /**
     * so sánh 2 hình tròn bằng nhau hay không
     *
     * @param circle hình tròn khác
     * @return bằng nhau hay không
     */
    public boolean equal(Circle circle){
        if(this.radius==circle.radius&&this.getPosition().equal(circle.getPosition())) return true;
        return false;
    }
}
