# This is an example Java project created via STS as a Java Project, utilizing:

- Interface(Person)
- Abstract Class(PersonBaseImpl)
- Interface(Teacher)
- Regular Class(TeacherImpl)
- Interface(Student)
- A static Main Entry(MainEntry)
- Regular Class(StudentImpl)

************************************************************************************
##You must have Spring Tool Suite installed, as well as the latest version of java jdk.
************************************************************************************

## How to import, and run project
- First, copy the github url of the rmeote project by going to the github link
- Then, copy the URL.
- On STS, go to File->import->Git->Project from Git
- click next
- click clone URL
- click NExt
- click Next
- choose remote branch
- click next
- choose "Destination" "Directory" for the project to be created in
- click Finish

## To run
In STS, click on this project Run As ->JavaApplication(select MainEntry)

# Explanation of code

### Person
- This interface takes two methods
 - Public String getName() : Gets the name
 - Public String getDetails() : Gets the details of the Person

### PersonBaseImpl
- This class implements the "Person" interface
 - Has an attribute String name that can be inherited
 - Has a constructor that takes "String _name" input and initializes "name" attribute
 - Has implementation of "getName()" method to simply return "name" attribute 

### Teacher
- This interface extends Person with the below method:
 - public String teachesFor()

### TeacherImpl
- This class extends PersonBaseImpl and implements the Teacher interface
 - It has an attribute "String thoughtCourseTitle"
 - Has a constructor that takes in 2 inputs, "String _name" and "String _thoughtCourseTitle"
 - Lets the above constructor invoke its parent's one to initialize iherited "name" attribute with "_name"
 - Lets above constructor initialize "thoughtCourseTitle" attribute with "_thoughtCourseTitle"
 - Has implementation of "teachesFor()" method that returns "thoughtCourseTitle" attribute
 - Has implemetation of "getDetails()" returning "teacher"

### Student
- This interface extends the Person class with the below method:
 - public String studiesFor()

### StudentImpl
- This is a class that extends "PersonBaseImpl" and implements the "Student" interface
 - It has an attribute "String takenCourseTitle"
 - Has a constructor that takes in 2 inputs, "String _name" and "String _takenCourseTitle"
 - Lets the above constructor invoke its parent's one to initialize iherited "name" attribute with "_name"
 - Lets above constructor initialize "takenCourseTitle" attribute with "_takenCourseTitle"
 - Has implementation of "studiesFor()" method that returns "takenCourseTitle" attribute
 - Has implemetation of "getDetails()" returning "student"

### MainEntry
- This is a class with a static main method
 - Local variables are declared
  - "Person p1, p2" : Creates 2 Person objects
  - "Teacher t", is initialized to new TeacherImpl("ilker", "java") : Calls the Teacher interface 
  - "Student s" is initialized to new StudentImpl("Mike", "java") : Calls the Student interface
 - p1 is set to t, and p2 is set to s
 - There is a System.out.println statement that prints the name of p1 and p2, which is ilker and mike.