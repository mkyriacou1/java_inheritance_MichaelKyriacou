package csci3444.inheritance;

public class TeacherImpl extends PersonBaseImpl implements Teacher
{
	String thoughtCourseTitle;
	
	
	public TeacherImpl(String _name, String _thoughtCourseTitle)
	{
		super(_name);
		thoughtCourseTitle=_thoughtCourseTitle;
	}
	
	public String teachesFor(String _thoughtCourseTitle)
	{
		return thoughtCourseTitle;
	}

	@Override
	public String getDetails() {
		
		return teachesFor();
	}

	@Override
	public String teachesFor() {
		// TODO Auto-generated method stub
		return thoughtCourseTitle;
	}
	
	

}
