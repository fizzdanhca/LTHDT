package tuan6;

/**
 * định nghĩa 1 Diagram
 *
 * @author Cao Thang
 */
public class Diagram {

    // mảng các layer
    private Layer[] layers;
    // số lượng các layer
    private int sizeOfLayers;

    /**
     * khởi tạo mặc định cho Diagram
     */
    Diagram() {
        layers = new Layer[20];
        sizeOfLayers = 0;
    }

    /**
     * thêm 1 layer vào Diagram
     *
     * @param element phần tử layer
     */
    public void addLayer(Layer element) {
        layers[sizeOfLayers++] = element;
    }

    /**
     * xóa layer vị trí pos trong mảng các layer
     *
     * @param pos vị trí trong mảng
     */
    public void delLayer(int pos) {
        for (int i = pos; i < sizeOfLayers - 1; i++) {
            layers[i] = layers[i + 1];
        }
        sizeOfLayers--;
    }

    /**
     * lấy 1 layer vị trí pos ra khỏi mảng
     *
     * @param pos vị trí
     * @return layer được chọn
     */
    public Layer getLayer(int pos) {
        return layers[pos];
    }

    /**
     * xóa các circle trong 1 Diagram
     */
    public void delAllCircle() {
        for (int i = 0; i < sizeOfLayers; i++) {
            layers[i].delAllCircle();
        }
    }
}
