package OOPS;

public class AcessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();

        myAcc.username = "Ritesh";
        System.out.println(myAcc.username);


        // myAcc.password = "abcde";
        myAcc.setPassword("abcde");
        // System.out.println(myAcc.password);
        
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword (String pwd) {
        password = pwd;
    }
}
