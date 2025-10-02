
// clear the concepts of class and object by using an example of a pen

// initialize a class, you say making a blueprint of a pen

class Pen{
    String colour;                                 // this is the " data " inside a class
    String type;

    public void write(){                          // methods(function inside the class) are the  " member " inside a class
        System.out.println("writing something");
    }

    public void printColour(){
        System.out.println(this.colour);          // " this " keyword has an ability to find out by which object its come from 😁
    }
}

// for object creation of the previously created blueprint of a pen

public class ra_1_class_and_objects_with_data_and_member {
    public static void main(String [] args){
        Pen pen1 = new Pen();                             // crate one pen object
        pen1.colour = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.colour = "black";
        pen2.type = "ball point";

        pen1.printColour();
        pen2.printColour();
    }
}
