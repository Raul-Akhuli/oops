// abstract is a concept, it's a blueprint, but you can't crate any object of this blueprint
// during inheritance we create same methods that is present inside a parent class so, what is the need of parent class
   // so make the parent class an " abstract class " so that only the concepts present.😁
   // abstract class possible also method possible


// hiding the implementation details and showing only important / useful part to the user


abstract class Animal{
    abstract public void walk();
    public void eat(){
        System.out.println("food differ animal to animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("created a chicken");
    }
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}



public class ra_7_abstraction {
    public static void main(String [] args){
        Horse horse = new Horse();
        horse.walk();
        horse.eat();

        Chicken chicken = new Chicken(); // constructor call during the object creation
                                         // no need to call explicitly like methods.
    }
}
