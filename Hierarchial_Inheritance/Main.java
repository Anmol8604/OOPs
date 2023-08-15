package Hierarchial_Inheritance;

// One class is inherited by many classes.
// Same rules apply as single level inheritance.
public class Main {
    public static void main(String[] args) {
        Base a = new Child1();
        Base b = new Child2();
        Base c = new Base();
    }
}
