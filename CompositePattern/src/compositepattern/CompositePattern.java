package compositepattern;

public class CompositePattern {
    
    public static void main(String[] args) {
        Employee CEO = new Employee("Lulit","CEO", 5000);
        Employee Sales = new Employee("rahel","Sales", 3000);
        Employee Marketing = new Employee("Abebe","Marketing", 2000);

        Employee clerk1 = new Employee("Melat","Marketing", 1000);
        Employee clerk2 = new Employee("Kal","Marketing", 1000);
        
        Employee Exec1 = new Employee("Abel","Sales", 500);
        Employee Exec2 = new Employee("Meron","Sales", 500);

        CEO.add(Sales);
        CEO.add(Marketing);
        
        Sales.add(Exec1);
        Sales.add(Exec2);
        
        Marketing.add(clerk1);
        Marketing.add(clerk2);
        
        clerk1.getAllBosses();
        Sales.getLowerEmployee();
        System.out.println("Employees below CEO include : ");
        
        CEO.getLowerEmployee();
        System.out.println("The Total Salary of all employees below Sales : " + Sales.getAllEmployeeSalary());		
    }
    
}
