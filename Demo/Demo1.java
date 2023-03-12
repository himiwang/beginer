/*
this commit test 
*/

public class Demo1 {

public static void main(String args[])
{
	
	
 Person p1 = new Person();
	System.out.println("zhulei p1" + p1);
	p1.printThis();
	System.out.println("-------------------------");
	 Person p2 = new Person();
	System.out.println("zhulei p2" + p2);
// 	p2.printThis();
//  p1.showInfo();
	//Person p2 =
	//new Person(3,"oo").showInfo();
	//new Person(3,"oo").showInfo();
	
	
/*Person p2 = p1;
	p2.age = 4;
	p2.name = "bb";
	p2.showInfo();
	p1.showInfo();*/
	
	//change(p1);
	//p2.showInfo();
}
	//public static void change(Person temp){
	//temp.age = 4 ;}
}

class Person
{
	public void printThis(){
		System.out.println("message" + this );}
	
//int age;
//String name;
	//public Person()
	//{ 
	//}	

/*public Person(int age, String name){

this.age = age;

this.name = name;

}
public void showInfo()
{ 
 System.out.println("l–¼¥F"+ this.name +"," + "age is " + this.age );
 }*/
}
