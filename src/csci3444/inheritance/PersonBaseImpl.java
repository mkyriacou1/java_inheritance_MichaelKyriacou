package csci3444.inheritance;

public abstract class PersonBaseImpl implements Person 
{
		
		String name;
		
		public PersonBaseImpl(String _name)
		{
			name = _name;
		}
		public String  getName()
		{
			return name;
		}
		

	}


