/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagement;

/**
 *
 * @author User
 */
public class Employee
{
	private String eid;
	private String en;
        private String sn;
        private int age;
        private String gender;
        private String department;
        private String shift;
        private int salary;
        private String post;
	private int pass;
	
	public Employee() {}
	
	public Employee(String eid, String en,String sn,int age, String gender,String department ,String shift, int salary,String post,int pass)
	{
		this.eid=eid;
		this.en=en;
                this.sn=sn;
                this.age=age;
                this.gender=gender;
		this.department=department;
		this.shift=shift;
		this.salary=salary;
		this.post=post;
		this.pass=pass;
	}
	
	
	public void setEid(String eid)
	{
		this.eid=eid;
	}
	public void setEname(String en)
	{
		this.en=en;
	}
	public void setSurname(String sn)
	{
		this.sn=sn;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
        public void setShift(String shift )
	{
		this.shift=shift;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
        public void setPost(String post )
	{
		this.post=post;
	}
	
        public void setPassword(int pass)
	{
		this.pass=pass;
	}
	
        
	
	
	
	public String getEid()
	{
		return eid;
	}
	public String getEname()
	{
		return en;
	}
	public String getSurname()
	{
		return sn;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public String getDepartment()
	{
		return department;
	}
        public String getShift()
	{
		return eid;
	}
        public int getSalary()
	{
		return salary;
	}
        public String getPost()
	{
		return post;
	}
        public int getPassword()
	{
		return pass;
	}
       
}