package prob2;

public class Rectangle extends GeometricObject {
  private double width;
  private double height;
  private double area;
  private boolean e = false;
  StringBuilder sb = new StringBuilder();

  public Rectangle() {
  }

  public Rectangle(double width, double height) {
	  this.width = width;
	  this.height = height;
	  area = this.width * this.height;
	try{
		
	if (area < 1.0){
		//this.width = width;
		//this.height = height;
		e =true;
		throw new IllegalRectangleException("Illegal Rectangle--->", width, height, (width*height));
	}
	
	}catch(IllegalRectangleException ire){
		if ((area) < 1.0){
			System.out.printf("%s Width:%.2f, Height:%.2f, Area:%.2f \n", ire.getMsg(), ire.getWidth(), ire.getHeight(), ire.getArea());
			sb.append(String.format("%s Width:%.2f, Height:%.2f, Area:%.2f \n", ire.getMsg(), ire.getWidth(), ire.getHeight(), ire.getArea()));
		}
	}
  }
  public boolean getE(){
	  return e;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
    this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  @Override /** Return area */
  public double getArea() {
    return width * height;
  }

  @Override /** Return perimeter */
  public double getPerimeter() {
    return 2 * (width + height);
  }

  @Override 
  public String toString() {
    // Implement it to return the three sides
	//if ((area) < 1.0) 
		return sb.toString();
	//else 
	//	return "Rectangle: width = " + width + ", height = " + height;
  }  
}
