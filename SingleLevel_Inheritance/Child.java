package SingleLevel_Inheritance;

public class Child extends  Base{
    double q;

    Child() {
        System.out.println("constructor of child");
    }

    Child(double a, double b, double c, double w) {
        super(a, b, c);
        this.q = q;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }
}
