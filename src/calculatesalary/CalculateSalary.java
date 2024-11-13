/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatesalary;

/**
 *
 * @author Administrator
 */
public class CalculateSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Nguyen Van A", 70000, 25);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Nguyen Van B", 150000);

        System.out.println(partTimeEmployee.getName() + " PartTime Employee Salaries: " + partTimeEmployee.calculateSalary());
        System.out.println(fullTimeEmployee.getName() + " FullTime Employee Salaries: " + fullTimeEmployee.calculateSalary());
    }
    
}
