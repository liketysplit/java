package prob2;

public class IllegalRectangleException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	double width;
	double height;
	double area;
	
	public IllegalRectangleException (String message, double width, double height, double area){
		this.message = message;
		this.width = width;
		this.height = height;
		this.area = area;
	}
	

	public String getMsg(){
		return message;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getArea(){
		return area;
	}
	
}