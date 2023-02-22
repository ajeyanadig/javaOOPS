import java.util.*;
abstract class Figure{
	int dimx,dimy;
	abstract int area(int dim1,int dim2);
}
class Rectangle extends Figure{
	int area(int dim1,int dim2){
		this.dimx=dim1;
		this.dimy=dim2;
		return this.dimx*this.dimy;
	}
}
class Square extends Figure{
	int area(int dim1,int dim2){
		return dim1*dim2;
	}
}
class Main{
	public static void main(String[] args) {
		Rectangle rect= new Rectangle();
		System.out.println(rect.area(3,4));
		Square sq= new Square();
		System.out.println(sq.area(3,4));
	}
}
