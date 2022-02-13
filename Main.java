public class Main {
    public static void main(String[] args) {
        
    }

    public static void equation(double a, double b, double c) {
        double D = b * b - 4 * a * c;
    
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (D == 0) {
            double x1;
            x1 = -b / (2 * a);
            System.out.println("x1 = " + x1);
        }
        else {
            System.out.println("Have no roots");
        }
    }
}