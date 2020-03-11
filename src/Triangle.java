// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public class Triangle extends TwoD{
    
    public Triangle (double a, double b, double c){
        super(a,b,c);
    }
    
    @Override
    public double area(){
        return 0.5 * a * b;
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
    public void setC(double c){
        super.setC(c);
    }
    
    @Override
    public double getC(){
        return super.getC();
    }
    
    @Override
    public String toString(){
        return String.format("%s%s%.3f", super.toString(), "==> area = ", getArea());
    }
}
