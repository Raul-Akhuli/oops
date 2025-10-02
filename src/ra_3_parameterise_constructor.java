
class Student_ {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student_(String name, int age){  // parameterise constructor just pass the value when you crate object
        this.name = name;
        this.age = age;
    }
}

public class ra_3_parameterise_constructor {
    public static void main(String [] args){
        /*
        Student_ s1 = new Student_();
        s1.name = "subhangi";
        s1.age = 22;

         */

        Student_ s1 = new Student_("subhangi", 22);

        s1.printInfo();
    }
}
