class Box{
	double width;
	double height;
	double depth;
	void setdim(){
	width=9;
	height=9;
	depth=9;
	}
	double volume(){
	return height*width*depth;
	}
}
class Boxdemo
{   public static void main(String[] args) {
    double x;
	Box box1=new Box();
	box1.setdim();
	x=box1.volume();
	System.out.println("Volume=" +x);
	}
}

