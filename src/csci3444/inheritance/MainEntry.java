package csci3444.inheritance;

import csci3444.inheritance.TeacherImpl;

public class MainEntry 
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Person p1, p2;
		Teacher t = new TeacherImpl("Ilker","java");
		Student s = new StudentImpl("Mike","java");
		
		p1=t;
		p2=s;
		
		System.out.println(p1.getName()  + " " + p1.getDetails());
		System.out.println(p2.getName() + " " + p2.getDetails());
		
		
	}
}
