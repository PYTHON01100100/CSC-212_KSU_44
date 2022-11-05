package comparetoEx;

public class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private double gpa;
	
	public Student()
	{
		id = 0;
		name = "NA";
		gpa = 5;
	}

	public Student(int id, double gpa, String name)
	{
		this.id = id;
		this.name = name;
		setGpa(gpa);
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getGpa()
	{
		return gpa;
	}
	
	public void setGpa(double gpa)
	{
		if (gpa >= 0 && gpa <= 5)
			this.gpa = gpa;	
	}

	@Override
	public int compareTo(Student a)
	{
		if (this.gpa > a.gpa)
			return 1;
		else if (this.gpa < ((Student)a).gpa)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}
	
}