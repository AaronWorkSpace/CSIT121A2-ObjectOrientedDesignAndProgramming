// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public class Sphere extends ThreeD {
    
    public Sphere(double a){
        super(a);
    }
    
    @Override
    public double area(){
        return 4.0 * Math.PI * Math.pow(a, 2);
    }
    
    @Override
    public double getArea(){
        return area();
    }
    
    public double volume(){
        return (4 * Math.PI * Math.pow(a, 3)) / 3;
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
        return String.format ("%s%s%.3f%s%.3f", "Sphere ", super.toString(),
                              getArea(), " and volume = ", getVolume());
    }
}
