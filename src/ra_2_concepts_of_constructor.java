
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){
        System.out.println("constructor called");    // non parameterise constructor
    }
}

public class ra_2_concepts_of_constructor {
    public static void main(String [] args){
        Student s1 = new Student();   // " new " keyword - allocation a space in heap for the object Student 😁
        s1.name = "subhangi";         // " Student() " this is a spacial type of function known as constructor 😁
        s1.age = 22;              // used for creation any object in java (class name and the constructor name should be same
                                            // they won't return anything, no return type, for one object you can call
                                            // the constructor only one time, it call automatically when you create a object)
                                        // non parameterise constructor
                                        // parameterise constructor (next file)
                                        // copy constructor()

        s1.printInfo();
    }
}
