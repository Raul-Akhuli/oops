/*
 static - whichever is same throughout the code common for all objects
          accessible by class name, no need to create an object
          memory assign only once

          need to save memory, common for everyone - use static keyword

 */


class Student____{
    String name;
    static String school;            // school name must be same for the students
    public void printSchool(){
        System.out.println(this.school);
    }
}

public class ra_9_static_concepts {
    public static void main(String [] args){
        Student____.school = "kesiara gobinda prasad vidyapith";
        Student____ student1 = new Student____();
        student1.name = "abc";

        System.out.println(student1.name);
        student1.printSchool();
    }
}
