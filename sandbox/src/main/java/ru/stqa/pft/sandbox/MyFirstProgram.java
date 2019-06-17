package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("world");

	//СОЗДАЛИ ОБЪЕКТ
		Square s= new Square(5);
		System.out.println("Площадь квадрата со стороной"+s.length+"="+s.area());

	//СОЗДАЛИ ОБЪЕКТ
		Rectangle r = new Rectangle(4, 6);
		r.lengthA=4;
		r.lengthB=6;
		System.out.println("Площадь прямоугольника со сторонами"+r.lengthA+"и"+r.lengthB+"="+r.area());
	}


	public static void hello(String somebody) {
		System.out.println("hi!"+somebody+"!");

	}

}