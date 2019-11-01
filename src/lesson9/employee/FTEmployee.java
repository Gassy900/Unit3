package lesson9.employee;
public class FTEmployee extends Employee
{
    
    public FTEmployee(){
    super();
}

    @Override
    public double getPay() {
        double pay;
        if (hours<=40){
        pay = rate * hours;
        }
        else{
            pay = 40 * rate + (hours-40) * rate *2;
        }
        
        totalPay += pay;
        return pay;
    }
    
}
