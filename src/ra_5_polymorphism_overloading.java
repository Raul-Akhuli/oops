
class Student___{
    String name;
    int age;

    // function with same name within the same class (overloading)

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){                   // functions with different purposes having a same name
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name + " " + age);
    }
    public int printInfo(){          // Java decides method uniqueness based only on method name + parameters, not return type.
        return age;                  // so you can't be able to use " public int printInfo(int age) "
    }

}

public class ra_5_polymorphism_overloading {
    public static void main(String [] args){
        Student___ s1 = new Student___();
        s1.name = "subhangi";
        s1.age = 22;

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
        System.out.println(s1.printInfo());
    }
}
