/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculatesalary;

/**
 *
 * @author Administrator
 */
public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8 * 30; // Giả định làm việc 8 tiếng/ngày, 30 ngày/tháng
    }
}
