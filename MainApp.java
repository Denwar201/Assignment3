package Emplo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(201,"ADDA","DENWAR",15000);
		System.out.println(e);
		int newSalary=e.raiseSalary(30);
		e.setSalary(newSalary);
		System.out.println(e);
		System.out.println("Annual salaray of the employee is : "+e.getAnnualSalary());

	}
}
