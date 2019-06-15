package ru.stqa.pft.sanbox;

public class MyFirstProgram {

public static void main (String[] args) {
	hello("hello");
	hello("misha!");
	hello("eto");
	hello("ti?");

	Square s = new Square(5);

	System.out.println(s.l = s.area());

	Rectangle r = new Rectangle(9,10);

	System.out.println(r.area());
}

public static void hello (String something)
{
	System.out.println("Hello, " + something);
}
	}

