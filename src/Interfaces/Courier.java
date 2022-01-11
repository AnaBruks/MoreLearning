package Interfaces;

public class Courier implements Worker{
    private int salary;
    public int getSalary() {
        return salary;
    }
    @Override
    public void doWork(Warehouse wh) {
        salary+=100;
        wh.setBalance(wh.getBalance()+1000);
        System.out.println(salary +" " + wh.getBalance());
    }

    @Override
    public void bonus(Warehouse wh) {
        if (wh.getBalance()<=1000000) {
            salary *= 2;
            System.out.println(salary );
        }

    }
}
