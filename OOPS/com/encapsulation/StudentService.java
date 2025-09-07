package OOPS.com.encapsulation;

 class StudentService {
	private Student s1;
    private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;
	private Student s6;
	 
	public void setStudentDetails()
	{
		 s1=new Student();
		s1.setStudentRollNumber(64);
		s1.setStudentName("Suraj");
		s1.setStudentAge(20);
		
		 s2=new Student();
		s2.setStudentRollNumber(32);
		s2.setStudentName("Govind");
		s2.setStudentAge(21);
		
		 s3=new Student();
		s3.setStudentRollNumber(43);
		s3.setStudentName("Lokendra");
		s3.setStudentAge(22);
		
		 s4=new Student();
		s4.setStudentRollNumber(62);
		s4.setStudentName("Raja");
		s4.setStudentAge(15);
		
		 s5=new Student();
		s5.setStudentRollNumber(61);
		s5.setStudentName("Saksham");
		s5.setStudentAge(14);
		
		s6=new Student();
		s6.setStudentRollNumber(65);
		s6.setStudentName("Krishna");
		s6.setStudentAge(12);
		
	}
	public void displayStudentDetails()
	{
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}

}
