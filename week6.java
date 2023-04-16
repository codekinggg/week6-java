import java.awt.Shape;

public interface Shape {
    void redraw();
    int getArea();
}

public class Oval implements Shape {
    int width;
    int height;

    public Oval(int width, int height) {
        this.width = width;
        this.height = height;
    }

   
    public void redraw() {
        System.out.println("Oval을 그립니다.");
    }

   
    public int getArea() {
        return (int) (Math.PI * width * height / 4);
    }
}

public class Rect implements Shape {
    int width;
    int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    
    public void redraw() {
        System.out.println("Rect를 그립니다.");
    }

    
    public int getArea() {
        return width * height;
    }
}

public class abc {
    public static void main(String[] args) {
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        
        for (int i = 0; i < list.length; i++) {
            list[i].redraw();
            System.out.println("면적은 " + list[i].getArea());
        }
    }
}