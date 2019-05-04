package JavaPractice;

import java.util.HashMap;
import java.util.Map;

//Example showing the multilevel inheritance 
//Example showing the usage of super keyword implementation and showcasing 
//Method overriding - run time polymorphism usage 

class Teacher {
 String teacherdetails = "107 Bower Road" ;
	//create constructor and pass the parameter
 
	Teacher (String Teachername , String teacherdetails)
	 {
	//assign the method to the constructor	
	this.enterteachername(Teachername) ;
	this.teacherdetails = teacherdetails ;
	System.out.println("Enter the teacher name :");	
	  }
	
	public String enterteachername (String teachername)
	{
		System.out.println("Teacher details entered :");
		return teachername ;
	}	
               }

class Student extends Teacher {

	Student(String Teachername) {
		//call the parent class constructor -pass different values 
		super(Teachername, Teachername);
		//calls the parent class method - parameter must be same while calling 
		//parent class - parameter details can be different 
		super.enterteachername(teacherdetails) ;
		//parent class method
		super.enterteachername(Teachername)  ;
		// TODO Auto-generated constructor stub
	}
	  
	public String studentdetals (String studentdetails)
	{
		//calls the parent class method - parameter type/name can be different
		//parameter cannot be increased .
		super.enterteachername(studentdetails) ;
		System.out.println("Enter the student details :");
		return studentdetails ;	
	  }	
            }
class Principal extends Student {

	Principal(String Principalname) { 
		//reuse of constructor and method - having different parameter type 
		super(Principalname);
		super.enterteachername(Principalname) ;
		// TODO Auto-generated constructor stub
	     }

   public String Principaldetails (String principaldetails)
   {
	//call parent class method 
	super.studentdetals(principaldetails) ;   
	return principaldetails;   
   }	
      }

class Parents extends Teacher {

	Parents(String Teachername, String Parentdetails) {
		//call the parent class constructor and passing different parameter
		//type values 
		super(Teachername, Parentdetails);
		// TODO Auto-generated constructor stub
	}
	public String Parentsdetails (String parentsdetails)
	{
		
		System.out.println("Enter the parents details : ");
		//call the parent class method 
		super.enterteachername(parentsdetails) ;
		return parentsdetails ;
	}
	
}



public class Methodoverriding_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap <String , String> hm = new HashMap <String , String> ();
//	hm.put(101, "Priya") ;
//	hm.put(224, "Jitu") ;
	 
	//to store teachername and teacherdetails inside the hashmap 
	
	hm.put("Khushi", "Priya sister") ;
	hm.put("Satyam", "Priya brother") ; 
	
    for (Map.Entry<String, String> alldetails : hm.entrySet() )
    {
    System.out.println("all key value present :" + alldetails.getKey() + " : " + "all values present :" 
    + alldetails.getValue() );	
    if (alldetails.getKey().equalsIgnoreCase("Khushi") 
    && alldetails.getValue().equalsIgnoreCase("Priya mother"))
    {
    break ;
    }
     }
    
    
    String Parentdetails = hm.get("Satyam") ; 
    String Teachername = "Khushi" ; 
    
	//hm.keySet() ;
	//get - method retrieves the specific value associated with that key 
//	String teachername = hm.get("Khushi") ;;
//	System.out.println("teacher name :" + teachername);
	//to get each key set 
//	for (Integer entrydetails : hm.keySet())
//	{
//	System.out.println("each key entry :" + entrydetails);	
//	}
	
	//creating objects of the Parent class 
	Parents obj = new Parents(Teachername, Parentdetails)	;
    System.out.println("Teachername and parentdetails are :" + obj.Parentsdetails(Parentdetails) + 
    		"-" + obj.Parentsdetails(Teachername)); 
    
    Teacher obj1 = new Parents(Teachername, Parentdetails) ;
    System.out.println("Teachername and parentdetails are : " + obj1.enterteachername(Teachername) 
    + "-"+ obj1.enterteachername(Parentdetails) ) ;
	}

}
