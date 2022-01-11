package Interfaces;

public class Warehouse {
    private int countOrder =0;
    private double balance=0;
    public int getCountOrder() {
        return countOrder;
    }
    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Warehouse(int countOrder, double balance) {
        this.countOrder = countOrder;
        this.balance = balance;
    }
    @Override
    public String toString(){
        String str = "Warehouse has: "+  balance + " " + countOrder;
        System.out.println(str);
        return str;
    }
}
