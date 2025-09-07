package OOPS.com.encapsulation;

public class Student {
	private int studentRollNumber;
	private String studentName;
	private int studentAge;
	public void setStudentRollNumber(int studentRollNumber)
	{
		this.studentRollNumber=studentRollNumber;
	}

	public int getStudentRollNumber()
	{
		return studentRollNumber;
	}
	public String getStudentName()
	{
		return studentName;
	}
	public void setStudentName(String studentName)
	{
		this.studentName=studentName;
	}
	public int getStudentAge()
	{
		return studentAge;
	}
	public void setStudentAge(int studentAge)
	{
		this.studentAge=studentAge;
	}
	@Override
	public String toString()
	{
		return "Student RollNumber:-"+getStudentRollNumber()+"\nStudentName:-"+getStudentName()+"\nStudent Age:-"+getStudentAge();
	}
	

}
