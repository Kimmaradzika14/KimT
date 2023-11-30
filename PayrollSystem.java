public class PayrollSystem {
    public static void main(String[] args) {
        Employee contractor = new Contractor("John Doe", 101, 35, 30);
        Employee fullTimeEmployee = new FullTimeEmployee("Alice Smith", 202, 65000);
        Employee manager = new Manager("Robert Johnson", 303, 75000, 1200);
 
        contractor.printPaySlip(contractor.calculatePay());
        fullTimeEmployee.printPaySlip(fullTimeEmployee.calculatePay());
        manager.printPaySlip(manager.calculatePay());
 
        double totalIncome = contractor.calculatePay() + fullTimeEmployee.calculatePay() + manager.calculatePay();
        System.out.println("\nTotal Income: $" + totalIncome);
    }
}