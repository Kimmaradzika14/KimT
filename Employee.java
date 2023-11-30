class Employee {
    private String name;
    private int id;
 
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
 
    public double calculatePay() {
        return 0;
    }
 
    public String getName() {
        return name;
    }
 
    public int getId() {
        return id;
    }
 
    public void printPaySlip(double pay) {
        System.out.println("Employee: " + getName() + ", ID: " + getId());
        System.out.println("Pay: $" + pay);
    }
}
 
class Contractor extends Employee {
    private double hoursWorked;
    private double rate;
 
    public Contractor(String name, int id, double hoursWorked, double rate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }
 
    @Override
    public double calculatePay() {
        return hoursWorked * rate;
    }
}
 
class FullTimeEmployee extends Employee {
    private double salary;
 
    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }
 
    @Override
    public double calculatePay() {
        return salary;
    }
}
 
class Manager extends FullTimeEmployee {
    private double monthlyBonus;
 
    public Manager(String name, int id, double salary, double monthlyBonus) {
        super(name, id, salary);
        this.monthlyBonus = monthlyBonus;
    }
 
    @Override
    public double calculatePay() {
        return super.calculatePay() + monthlyBonus;
    }
}
 
