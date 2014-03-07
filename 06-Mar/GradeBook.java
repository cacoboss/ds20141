/*
	Gradebook.java: Stores grades for DS
*/

public class GradeBook{
	
	private String course;
 	private int code;

	public GradeBook(String course, int code){
		this.course = course;
		this.code = code;
	}
	
	public GradeBook(int code){
		this("",code);
	}

	public GradeBook(){
		this("UNAL", 0);
	}
	public void setCourse(String course){
		this.course = course;
	}

	public String getCourse(){
		return this.course;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return this.code;
	}
	@Override	
	public String toString(){
		//Returns a formatted String
		return String.format("[%s - %d]" , course, code);		
	}	
}

