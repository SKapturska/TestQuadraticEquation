package testquadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }


    public int rootNumber() {
        double d = (b * b) - (4 * a * c);
        int root = 0;
        if (d > 0) {
            root += 2;
        } else if (d == 0) {
            root++;
        }
        return root;
    }
    
    public double calculateDiscriminant(){
        System.out.println(((b*b)-(4*a*c)));
        return ((b*b)-(4*a*c));
    }


}
