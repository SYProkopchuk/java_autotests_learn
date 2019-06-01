package ru.stqa.pft.sanbox;

public class MyFirstProgram {

public static void main (String[] args) {
	hello("hello");
	hello("misha!");
	hello("eto");
	hello("ti?");
	double len=5;
	double d=6;
	System.out.println(area(len,d));

}

public static void hello(String something){
	System.out.println("Hello, " + something);
}
public static double area (double jopa) {

	return jopa*jopa;
}

public static double area(double a, double b) {
	return a*b;
}
}