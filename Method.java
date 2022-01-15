package method.program;

public class Method {
	String name;
	int age;
	char section, gender;
	int sub1, sub2, sub3;
	int SM;
	
public Method(String string, int i, char c, char d, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}

public void student(String n, int a, char c, char g, int m1, int m2, int m3)
{
	name=n;
	age= a;
	section =c;
	gender=g;
	sub1=m1;
	sub2=m2;
	sub3=m3;
}

public int marks()
{
	return sub1+sub2+sub3;
}

public float percentage()
{
	return(marks()*100)/300;
}

public static void main(String[] args) {
	Method s1=new Method("Kavita",25,'A','F',68,75,80);
	Method s2=new Method("Savita",24,'A','F',75,79,81);
	Method s3=new Method("Pavita",25,'A','F',80,79,85);
	System.out.println("total marks of student s1 " + s1.marks() +"percentage of student " + s1.percentage());
	System.out.println("total marks of student s2 " + s2.marks() +"percentage of student " + s2.percentage());
	System.out.println("total marks of student s3 " + s3.marks() +"percentage of student " + s3.percentage());
}
}
