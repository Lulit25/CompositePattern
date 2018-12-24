package compositepattern;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;
public class Employee {
            private Employee boss; 
            private String name;
            private String dept;
            private int salary;
            private List<Employee> EmployeeList;

            // constructor
            public Employee(String name,String dept, int salary) {
               this.name = name;
               this.dept = dept;
               this.salary = salary;
               EmployeeList = new ArrayList<Employee>();
            }
            public String getName() {
                 return name;
            }
            public int getSalary() {
                 return salary;
            }
            public String dept() {
                 return dept;
            }
            public String setBoss(Employee boss) {
                 this.boss = boss;
                 return null;
            }
            public Employee getBoss() {
                 return this.boss;
            }
            public void getAllBosses() {
                if (this.boss != null ) {
                     System.out.println(this.boss.getName()); 
                     this.boss.getAllBosses(); 
                 }  
            }
            public int getAllEmployeeSalary() {
                 int totalSalary = salary;
                 if(true){
                    
                             for (Iterator<Employee> it = EmployeeList.iterator(); it.hasNext();) {
                                 Employee item;
                                 item = it.next();
                                 totalSalary = totalSalary + item.getAllEmployeeSalary();
                             }
                }
                         return totalSalary; 
            }
            public void getLowerEmployee(){
                int a = EmployeeList.size();
              if (a>0) {
                    for (Iterator<Employee> it = EmployeeList.iterator(); it.hasNext();) {
                        Employee element = it.next();
                        System.out.println(element.name);
                          element.getLowerEmployee();
                    }
                 }
            }
             public Employee setEmployeeBoss(Employee e) {
                     e.setBoss(this);
                     return null;
             }
            public void add(Employee e) {
               EmployeeList.add(e);
               e.setBoss(this);
            }

            public void remove(Employee e) {
               EmployeeList.remove(e);
            }

            public List<Employee> getSubordinates(){
              return EmployeeList;
            }

             @Override
            public String toString(){
               return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
            }   
    
}
