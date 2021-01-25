package day05;

public class Circle {
    private int R;
    private float pi;

    public Circle() {
    }

    public Circle(int r, float pi) {
        R = r;
        this.pi = pi;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }
    public void showArea(){
        System.out.println("圆的面积是" +R*pi);
    }
    public void showPerimeterZ(){
        System.out.println("圆的周长是" + pi*(R)*2);
    }
}
