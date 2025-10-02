package Bank;
/*
encapsulation is a concept of hiding something, let say 'class--> is responsible for hide data and members inside of it.'
data hiding - is the process of protecting members(methods) of class form unintended changes.
 */
class Account{
    public String name;
    protected String email;
    String branch;
    private String password = "wifi";

    // if you want to access private content
    // getter & setter

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){   // set password by your own then print it
        this.password = pass;
    }

}
public class Bank {
    public static void main(String [] args){
        Account account1 = new Account();
        //account1.setPassword("abc");     // set up password by yourself
        System.out.println(account1.getPassword());
    }
}
