class ShapeTest { 
  public static void main(String args[]) {  
  
       Rectangle r = new Rectangle(20, 10);    
        Triangle t = new Triangle(10,5);   
          
          Shape s1; 
          
          s1 = r;     
    System.out.println("Area of rectangle is " + s1.display_area()); 

         s1= t;
    System.out.println("Area of triangle is " + s1.display_area());

  }
}


