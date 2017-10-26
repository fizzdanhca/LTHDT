package tuan6;

/**
 * định nghĩa hình vuông
 *
 * @author Cao Thang
 */
public class Square extends Rectangle {

    /**
     * hàm khởi tạo cho cạnh là 1.0
     */
    public Square() {
        this.setLength(1.0);
        this.setWidth(1.0);
    }

    /**
     * hàm khởi tạo cho cạnh là side
     *
     * @param side cạnh
     */
    public Square(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    /**
     * hàm khởi tạo cho cạnh là side, màu color, viền filled
     *
     * @param side cạnh
     * @param color màu sắc
     * @param filled viền
     */
    public Square(double side, String color, boolean filled) {
        this.setLength(side);
        this.setWidth(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    /**
     * hàm lấy độ dài cạnh hình vuông
     *
     * @return cạnh hình vuông
     */
    public double getSide() {
        return this.getLength();
    }

    /**
     * hàm cài độ dài cạnh hình vuông
     *
     * @param Side cạnh hình vuông
     */
    public void setSide(double Side) {
        super.setLength(Side);
        super.setWidth(Side);
    }

    /**
     * hàm cài cạnh hình vuông
     *
     * @param Side cạnh hình vuông
     */
    public void setWidth(double Side) {
        setSide(Side);
    }

    /**
     * kiểm tra thông tin của hình
     *
     * @return thông tin hình
     */
    public String toString() {
        return "Square{" + "Side=" + getWidth() + ", color=" + getColor() + ", filled=" + isFilled() + '}';
    }

    /**
     * hàm cài cạnh hình vuông
     *
     * @param Side cạnh hình vuông
     */
    public void setLength(double Side) {
        setSide(Side);
    }

    /**
     * xem hình có trùng không
     *
     * @param square hình vuong khác
     * @return trùng hay không trùng
     */
    public boolean equal(Square square) {
        if (this.getSide() == square.getSide() && this.getPosition().equal(square.getPosition())) {
            return true;
        }
        return false;
    }
}
