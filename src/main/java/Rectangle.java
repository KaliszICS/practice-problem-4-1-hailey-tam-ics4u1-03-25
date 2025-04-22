public class Rectangle {
    private double length;
    private double width;
    
	//constructor
	public Rectangle(double l, double w){
		this.length = l;
		this.width = w;
	}

	//getters
	public double getLength(){
		return this.length;
	}

	public double getWidth(){
		return this.width;
	}

	//methods
	public double area(){
		if (this.width > 0 && this.length > 0){
		return this.length*this.width;
		}
		return 0.0;
	}

	public double perimeter(){
		if (this.width > 0 && this.length > 0){
		return 2*(this.length + this.width);
		}
		return 0.0;
	}
}
