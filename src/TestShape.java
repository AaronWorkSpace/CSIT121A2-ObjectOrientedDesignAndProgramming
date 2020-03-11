// Done by: Aaron Lim
// It is my own work, and I have not passed my
// program to my friends…
// and willing to accept whatever consequences 

public class TestShape {
    
    public static void main(String[] args){
        Circle s1 = new Circle(5.6);
        Rectangle s2 = new Rectangle(3.5, 6.8);
        Triangle s3 = new Triangle(2.0, 3.0, 4.0);
        Sphere s4 = new Sphere (8.8);
        Cube s5 = new Cube (7.8);
        Tetrahedron s6 = new Tetrahedron (1.8);

        Shape [] shape = new Shape[6];
        
        shape[0] = s1;
        shape[1] = s2;
        shape[2] = s3;
        shape[3] = s4;
        shape[4] = s5;
        shape[5] = s6;
        
        
        
        for (int i = 0; i < shape.length; i++){
            System.out.println ("Shape [" + i + "] = " + shape[i]);
        }
    }
}
