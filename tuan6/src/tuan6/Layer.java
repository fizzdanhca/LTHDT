package tuan6;

/**
 * định nghĩa 1 layer
 *
 * @author Cao Thang
 */
public class Layer {

    //mảng các shape trong 1 layer
    private Shape[] shapes;
    //số lượng các shape trong 1 layer
    private int sizeOfShapes;
    // quy định việc nhìn thấy hình trên 1 layer
    private boolean visiable;

    /**
     * khởi tạo mặc định
     */
    Layer() {
        shapes = new Shape[20];
        sizeOfShapes = 0;
        visiable = true;
    }

    /**
     * xem có nhìn thấy được hay không
     *
     * @return có nhìn thấy hoặc không
     */
    public boolean isVisiable() {
        return visiable;
    }

    /**
     * thiết lập việc nhìn được hay không
     *
     * @param visiable
     */
    public void setVisiable(boolean visiable) {
        this.visiable = visiable;
    }

    /**
     * thêm 1 shape vào layer
     *
     * @param element phần tử shape
     */
    public void addShape(Shape element) {
        shapes[sizeOfShapes++] = element;
    }

    /**
     * lấy ra shape vị trí pos
     *
     * @param pos vị trí
     * @return shape được chọn
     */
    public Shape getShape(int pos) {
        if (pos < sizeOfShapes && visiable == true) {
            return shapes[pos];
        } else {
            return null;
        }
    }

    /**
     * xóa 1 shape vị trí pos trong mảng các shape
     *
     * @param pos ví trí của shape trong mảng
     */
    public void delShape(int pos) {
        for (int i = pos; i < sizeOfShapes - 1; i++) {
            shapes[i] = shapes[i + 1];
        }
        sizeOfShapes--;
    }

    /**
     * xóa tất cả các Triangle trong layer
     */
    public void delAllTriangle() {
        for (int i = 0; i < sizeOfShapes; i++) {
            if (shapes[i] instanceof Triangle) {
                delShape(i);
                i--;
            }
        }
    }

    /**
     * xóa tất cả các Circle trong layer
     */
    public void delAllCircle() {
        for (int i = 0; i < sizeOfShapes; i++) {
            if (shapes[i] instanceof Circle) {
                delShape(i);
                i--;
            }
        }
    }

    public void delDuplicate() {
        for (int i = 0; i < this.sizeOfShapes - 1; i++) {
            for (int j = i + 1; j < this.sizeOfShapes; j++) {
//                if(this.shapes[i] instandOf)
            }
        }
    }

}
