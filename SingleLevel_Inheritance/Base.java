package SingleLevel_Inheritance;

public class Base {
    private double l;
    private double h;
    private double w;

    public Base() {
        l = 0;
        h = 0;
        w = 0;
        System.out.println("constructor of base");
    }

    public Base(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }
}
