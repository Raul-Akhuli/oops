
class Student__{
    String name;
    int age;

    public void printInfo(){            // 3. print the content of s2
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student__(Student__ s2){           // 2. content copy from s1 to s2
        this.name = s2.name;
        this.age = s2.age;
    }
    Student__(){            // you need to prepare by default an empty constructor for the s1

    }

}


public class ra_4_copy_constructor {
    public static void main(String [] args){
        Student__ s1 = new Student__();
        s1.name = "subhangi";
        s1.age = 22;

        Student__ s2 = new Student__(s1);  // 1. directly assign the content of s1 to s2 (copy)
        s2.printInfo();
    }
}
