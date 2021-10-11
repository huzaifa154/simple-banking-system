/**
 *
 * @author Your name
 */
package coe318.lab4;
public class Account {
    private String name;
    private int accNum;
    private double currBal;

public Account (String name, int accNum, double currBal){
   this.name = name;
   this.accNum = accNum;
   this.currBal = currBal;
}

 String getName() {
     return this.name;
 }

 int getNumber(){
     return this.accNum;
 }
 
double getBalance(){
    return this.currBal;
}

boolean deposit(double amount){
    if (amount >0){
        currBal += amount;
    }
    return amount >0;
}


boolean withdraw (double amount){
    if ((amount < currBal) && (amount >0)) {
        currBal = currBal - amount;
    }
    return (amount < currBal) && (amount >0);
}

@Override 
public String toString() {
//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " +String.format("$%.2f", getBalance()) + ")";
}
}

