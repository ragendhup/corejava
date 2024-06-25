package employees;

public class Employee {
	private String name;
	private int employeeid;
	private int salary;
    void show()
    
    {
	System.out.println("Name:"+name+ "\tEmployeeid:"+employeeid+"\t Salary:"+salary);
}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeid=" + employeeid + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

