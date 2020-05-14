package csci3444.inheritance;

public class StudentImpl extends PersonBaseImpl implements Student
{
	String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle)
	{
		super(_name);
		takenCourseTitle=_takenCourseTitle;
	}
	
	public String teachesFor(String _thoughtCourseTitle)
	{
		return takenCourseTitle;
	}

	@Override
	public String getDetails() {
		
		return studiesFor();
	}

	@Override
	public String studiesFor() {
		// TODO Auto-generated method stub
		return takenCourseTitle;
	}
	

}
