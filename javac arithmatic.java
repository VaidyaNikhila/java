class student
{
	int rollno;
	String name;
	float fee;
	student(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
void display()
{
	System.out.println(rollno+""+name+""+fee);
}
}
class TestThis2{
	public static void main(Stringargs[])
	{
		Student s1=new Stuident (111,"sony",3000f);
		Student s2=new Student(123,"sana",2000f);
		s1display();
		s2.isplay();
	}
}
	
