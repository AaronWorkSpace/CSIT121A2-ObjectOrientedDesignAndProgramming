// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public class Rectangle extends TwoD{
    
    Rectangle(double length, double width){
        super(length, width);
    }
    
    @Override
    public double area(){
        return a * b;
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
    public void setB(double b){
        super.setB(b);
    }
    
    @Override
    public double getB(){
        return super.getB();
    }
    
    @Override
    public String toString(){
        return String.format("%s%s%.3f", super.toString(), " ==> area = ", getArea());
    }
}
