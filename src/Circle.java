// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public class Circle extends TwoD {
      
    public Circle(double radius){
        super(radius);
    }
    
    @Override
    public double area(){
        return Math.PI * a * a;
    }
    
    @Override
    public double getArea(){
        return area();
    }
    
    @Override
    public void setA(double a){
        super.setA(a);
    }
    
    @Override
    public double getA(){
        return super.getA();
    }
    
    @Override
    public String toString(){
        return String.format("%s%s%.3f", super.toString(), " ==> area = ", getArea());
    }
    
}
