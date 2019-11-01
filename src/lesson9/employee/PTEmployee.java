package lesson9.employee;
public class PTEmployee extends Employee {

    
public PTEmployee(){
    super();
}    
    
    @Override
    public double getPay() {
        totalPay += rate * hours;
        return hours * rate;
    }
    
}
