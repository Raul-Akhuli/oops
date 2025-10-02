// pure abstraction is known as interface - no more flexibility, no constructor define.

interface Animal_{
    int eyes = 2;           // you can't change it
    void walk();
}

interface Herbivore{

}
class Horse_ implements Animal_, Herbivore{    //multiple base class with single derive class (multiple inheritance)
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}


public class ra_8_pure_abstraction_named_as_interface {
    public static void main(String [] args){
        Horse_ horse = new Horse_();
        horse.walk();
    }
}
