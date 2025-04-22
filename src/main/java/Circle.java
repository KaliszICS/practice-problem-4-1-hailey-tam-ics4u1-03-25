public class Circle {
   private double radius;

   public Circle (double r){
    this.radius = r;
   }

   //getters
   public double getRadius(){
    return this.radius;
   }

   //methods
   public double area(){
    return 3.14*Math.pow(this.radius,2);
   }

   public double circumference(){
    return 2*this.radius*3.14;
   }
}
