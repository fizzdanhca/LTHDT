package tuan6;

/**
 * định nghĩa hình tam giác
 *
 * @author Cao Thang
 */
public class Triangle extends Shape {

    // cạnh thứ nhất
    private int edge1;
    // cạnh thứ 2
    private int edge2;
    // cạnh thứ 3
    private int edge3;

    /**
     * khởi tạo mặc định
     */
    Triangle() {
        edge1 = 1;
        edge2 = 1;
        edge3 = 1;
    }

    /**
     * thông tin của hình
     *
     * @return thông tin hình
     */
    public String toString() {
        return "Triangle{" + "edge1=" + edge1 + ", edge2=" + edge2 + ", edge3=" + edge3 + '}';
    }

    public boolean equal(Triangle triangle) {
        if (this.edge1 == triangle.edge1 && this.edge2 == triangle.edge2 && this.edge3 == triangle.edge3 && this.getPosition().equal(triangle.getPosition())) {
            return true;
        }
        return false;
    }

}
