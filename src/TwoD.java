// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public abstract class TwoD implements Shape {
    protected double a;
    protected double b;
    protected double c;
    
    public TwoD(){
        this.a = 1.0;
    }
    
    public TwoD (double a){
        this.a = a;
    }
    
    public TwoD(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public TwoD(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public void setB(double b){
        this.b = b;
    }
    
    public void setC(double c){
        this.c = c;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    @Override
    public String toString(){
        if (b == 0)
            return "Circle (2D (" + a + "))";
        else if (c == 0)
            return "Rectangle (2D (" + a + ", " + b + "))";
        else
            return "Triangle (2D (" + a + ", " + b + "," + c + "))";
    }
}
