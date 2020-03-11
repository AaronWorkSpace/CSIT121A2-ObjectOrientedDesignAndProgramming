// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public class Tetrahedron extends ThreeD {
    
    public Tetrahedron(double a){
        super(a);
    }
    
    @Override
    public double area(){
        return Math.sqrt (3 * Math.pow(a, 2));
    }
    
    @Override
    public double getArea(){
        return area();
    }
    
    public double volume(){
        return (Math.pow(a, 3)) / (6 * Math.sqrt (2));
    }
    
    public double getVolume(){
        return volume();
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
        return String.format ("%s%s%.3f%s%.3f", "Tetrahedron ", super.toString(), 
                              getArea(), " and volume = ", getVolume());
    }        
}
