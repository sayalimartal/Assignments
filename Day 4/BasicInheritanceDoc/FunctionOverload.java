//Function overloading using different parameter types in parent and child classes
class Parent{                       //Parent class
	void display(String name) { //Parameter is of type 'String'
		System.out.println("Hello "+name+". Welcome to parent class");
	}
}
class Child extends Parent{        //Child class
	void display(int i) {      //Parameter is of type 'int'
		System.out.println("Child class "+i);
	}
}
public class FunctionOverload {
	public static void main(String[] args) {
		Child child=new Child();  // creating an object of child class
		child.display("Sayali");
		child.display(2);
	}
}
