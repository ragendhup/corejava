package employees;

public class Developer {
	private String name;
	private int developerid;
	private int salary;
    void show()
    
    {
	System.out.println("Name:"+name+ "\tDeveloperid:"+developerid+"\t Salary:"+salary);
}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", developerid=" + developerid + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeveloperid() {
		return developerid;
	}
	public void setDeveloperid(int developerid) {
		this.developerid = developerid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
