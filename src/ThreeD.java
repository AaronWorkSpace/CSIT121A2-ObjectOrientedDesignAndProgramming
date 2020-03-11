// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public abstract class ThreeD implements Shape {
    
    protected double a;
    
    public ThreeD (double a){
        this.a = a;
    }
    
    public void setA(double a){
        this.a = a;
    }
    
    public double getA(){
        return a;
    }
    
    @Override
    public String toString(){
        return "(3D (" + a + ")) ==> surface area = ";
    }
}
