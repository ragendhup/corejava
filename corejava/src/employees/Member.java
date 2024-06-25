package employees;

public class Member {
	private String name;
	private int managerid;
	private int salary;
    void show()
    
{
	System.out.println("Name:"+name+ "\t Managerid:"+managerid+"\t Salary:"+salary);
}
	@Override
	public String toString() {
		return "Member [name=" + name + ", managerid=" + managerid + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
