public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // constructor that is used to create an object
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "GururajNaik";
        myAcc.setPassword("abcdefghi");
        System.out.println(myAcc.username);
        // cannot access pass bcz it is private but u can change passwd using setpasswd 
        System.out.println(myAcc.getPasswd());
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
    // Getters
    String getPasswd(){
        return this.password;
    }
}
class Pen{
    String color;
    int tip;

    //setters
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}