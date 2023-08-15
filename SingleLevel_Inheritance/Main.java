package SingleLevel_Inheritance;

// 1. We have to create a class outside the main method.
// 2. Classes (User defined data type) are passed by reference.
public class Main {
    public static void main(String[] args) {
        Base a = new Base(2, 4,5);
        // System.out.println(a.getH() + " " + a.getL() + " " + a.getW());

        Child b = new Child(5, 8, 9, 42);
        // System.out.println(b.getH() + " " + b.getL() + " " + b.getW() + " " + b.getQ());

        Base c = new Child(5, 8, 9, 90);
        // System.out.println(c.getH() + " " + c.getL() + " " + c.getW() + " ");


        Base d =  new Base();
        Child e = new Child(); // It will first call the constructor of Base class, then it call's the constructor of child class.

        Base f = new Child();
//        Child g = new Base();
    }
}
