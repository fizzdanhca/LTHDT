package tuan6;

/**
 * Lớp xử lý các đối tượng
 *
 * @author Cao Thang
 */
public class Main {

    /**
     * hàm chính xử lý các hoạt động
     *
     * @param args
     */
    public static void main(String[] args) {
        // khởi tạo diagram
        Diagram d = new Diagram();
        // khởi tạo circle
        Shape s1 = new Circle();
        // khởi tạo rectangle
        Shape s2 = new Rectangle();
        // khởi tạo square
        Shape s3 = new Square();
        // khởi tạo triangle
        Shape s4 = new Triangle();
        // khởi tạo layer 11
        Layer l1 = new Layer();
        // khởi tạo layer l2;
        Layer l2 = new Layer();
        // thiết lập các mối quan hệ giữa diagram, layer và các shape
        d.addLayer(l1);
        d.addLayer(l2);
        d.getLayer(0).addShape(s1);
        d.getLayer(0).addShape(s2);
        d.getLayer(1).addShape(s3);
        d.getLayer(1).addShape(s4);
        // xử lý
        System.out.println("\n--------ban dau --------");
        if (d.getLayer(0).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(0).toString());
        }
        if (d.getLayer(0).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(1).toString());
        }
        if (d.getLayer(1).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(0).toString());
        }
        if (d.getLayer(1).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(1).toString());
        }
        d.getLayer(0).setVisiable(false);
        System.out.println("\n--------CHE LAYER 0 --------");
        if (d.getLayer(0).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(0).toString());
        }
        if (d.getLayer(0).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(1).toString());
        }
        if (d.getLayer(1).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(0).toString());
        }
        if (d.getLayer(1).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(1).toString());
        }
        d.getLayer(0).setVisiable(true);
        System.out.println("\n--------HIEN LAYER 0 --------");
        if (d.getLayer(0).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(0).toString());
        }
        if (d.getLayer(0).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(1).toString());
        }
        if (d.getLayer(1).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(0).toString());
        }
        if (d.getLayer(1).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(1).toString());
        }

        d.getLayer(0).delAllTriangle();// xóa triangle trong layer 0
        d.getLayer(1).delAllTriangle();// xóa triangle trong layer 1
        System.out.println("\n--------delete  all TRIANGLE in layer 1 --------");
        if (d.getLayer(0).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(0).toString());
        }
        if (d.getLayer(0).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(1).toString());
        }
        if (d.getLayer(1).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(0).toString());
        }
        if (d.getLayer(1).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(1).toString());
        }
        d.delAllCircle();// xóa circle trong diagram
        System.out.println("\n--------delete  all CIRCLE in diagram --------");
        if (d.getLayer(0).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(0).toString());
        }
        if (d.getLayer(0).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(0).getShape(1).toString());
        }
        if (d.getLayer(1).getShape(0) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(0).toString());
        }
        if (d.getLayer(1).getShape(1) == null) {
            System.out.println("khong ton tai");
        } else {
            System.out.println(d.getLayer(1).getShape(1).toString());
        }

    }

}
