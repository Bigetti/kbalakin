package ru.job4j.condition;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public double distanceTo(Point that) {
		// Точка А - это текущая точка. К ней мы обращаемся через оператор this.
    Point a = this;
    // Точка В - это входящая точка. К ней мы можем обратиться напрямую через имя переменной that.
    // или для удоства мы создали новую переменню b и к ней присвоили переменную this.
    Point b = that;
    // сделаем вывод на консоль.
    System.out.println("x1 = " + a.x);
    System.out.println("y1 = " + a.y);
    System.out.println("x2 = " + b.x);
    System.out.println("y2 = " + b.y);
    double result = Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
	return result;
	}
	
	public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
		double result = a.distanceTo(b);
	    System.out.println("Расстояние между точками А и В : " + result);
	}
	
}
