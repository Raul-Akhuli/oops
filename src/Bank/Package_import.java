package Bank;

public class Package_import {
    public static void main(String [] args){
        Account account1 = new Account();
        account1.name = "subhangi";
        account1.email = "abc@gmail.com";
        account1.branch = "CSE(AI & ML)";
        //account1.password = "abc";  you can't access it, it is private in the package

        //account1.setPassword("hello");       // when ever you set password by your own
        System.out.println(account1.getPassword());
    }
}
