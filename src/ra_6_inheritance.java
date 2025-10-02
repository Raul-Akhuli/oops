
class Shape{
    String colour;

    // overriding same method in different class having different purposes
    public void info(){
        System.out.println(this.colour);
        System.out.println("parent first");
    }
}
class Triangle extends Shape{
    public void info(){
        super.info();            // help to call the parent's info method without creating the object of the parent class separately
        System.out.println("child first");
    }
}
class EquilateralTriangle extends Triangle{
    public void info(){
        System.out.println("sub-child first");
    }
}
public class ra_6_inheritance {
    public static void main(String [] args){
        Triangle t1 = new Triangle();
        t1.colour = "red";
        t1.info();              // only call the Triangle info


        /*  // Upcasting😁
        Shape ts2 = new Triangle();  // same thing happening here without 'super' keyword you can't access the same method in parent class
        ts2.area();                  // and if you don't want to use the 'super' keyword, need to crate an object of parent class separately
         */

    }
}
/*

      1. single level inheritance             2. multi level inheritance                      3. hierarchical inheritance

l1    Shape (base class / parent class)         Shape                                                   Shape
        |                                          |                                                  /      \
l2    Triangle (derive class / child class)     Triangle (base class Shape)                     Triangle   Circle (for both base class Shape)
                                                   |
l3    nothing                                   Equilateral Triangle (base class Triangle)


     4. hybrid inheritance -----> mix of previous 3 inheritance

     5. multiple inheritance (not in form of a class in java (only in c++))
           we need 'interfaces' to implement this inheritance
                     multiple base class
                         /       \
                     single derive class

 */
