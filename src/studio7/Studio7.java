package studio7;

import java.awt.geom.Rectangle2D;

public class Rectangle {

	private int length=3;
	private int width=5;
	
	public Rectangle(int l,int w) {
		this.length=l;
		this.width=w;
		}
		
	//public int getLength() {
	//}
	
	public double areaCalculator(){
		int area=this.length*this.width;
		return area;
	}
	
	//to.string method
	public void printRectangle() {
		System.out.println("Area"+areaCalculator());
		if(compare(7,4)==true) {
		System.out.println("Rectangle 1 has larger area");
		}else {
		System.out.println("Rectangle 2 has larger area");
		}
	}
	
	public static void main(String[] args) {
		Rectangle rec1=new Rectangle(3,5);
		Rectangle rec2=new Rectangle(7,4);		
	}
	public boolean compare(Rectangle other) {
	return this.areaCalculator()<other.areaCalculator();
	}
}
