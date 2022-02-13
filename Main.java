import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        if(args.length == 0) {
            double a = 0, b = 0, c = 0;

            System.out.print("a = ");
            a = readData();
            System.out.print("b = ");
            b = readData();
            System.out.print("c = ");
            c = readData();

            printEquation(a,b,c);
            equation(a,b,c);
        } else {
            
        }
    }

    public static void printEquation(double a, double b, double c) {
        System.out.println("Equation is: " + "(" + a + ") x^2 + (" + b + ") x + (" + c + ") = 0");
    }

    public static double readData(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextDouble()) {
            return scanner.nextDouble();
        }
        else{
            String data = scanner.next();
            System.out.println("Error. Expected a valid real number, got " + data + " instead");
            return readData();
        }
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