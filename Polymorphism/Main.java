package Polymorphism;

// Poly + morphism => many + ways to represent
/*
There are two types of polymorphism
1. Compile Time Polymorphism / Static Polymorphism:- this is achieved by method overloading, e.g., println method of out stream.
    Over-loading: Overloading is achieved when methods as same name butt different return types, different types or numbers of arguments, and different function types.
    Example: multiple constructor, println(), printf(), print() etc. methods.

2. Run Time Polymorphism / Dynamic Polymorphism:- this is achieved by method overriding, e.g., child and parent have method with the same number of arguments in the same order, same return type, same name.
    Over-riding :-

    If the method is final, you can't override it.

*/

public class Main {
    public static void main(String[] args) {
        Shapes a = new Shapes();
        Shapes b = new Circle();
        Shapes c = new Square();
        Shapes d = new Triangle();

        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        // Run time polymorphism e.g.,
        a.area();
        b.area();
        c.area();
        d.area();
        circle.area();
        triangle.area();
        square.area();


    }
}
