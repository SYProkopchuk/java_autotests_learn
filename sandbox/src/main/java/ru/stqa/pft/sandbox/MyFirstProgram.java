package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");

		double length = 5;
		System.out.println("Площадь квадрата со стороной"+length+"="+area(length));
		double a=4;
		double b=6;
		System.out.println("Площадь прямоугольника со сторонами"+a+"и"+b+"="+area (a, b));
	}


	public static void hello(String somebody) {
		System.out.println("hi!"+somebody+"!");

	}

	public static double area (double length) {
		return  length*length;

	}
	public static double area ( double a, double b) {

		return a*b;
	}
}