import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        double a = 0, b = 0, c = 0;

        if(args.length == 0) {
            System.out.print("a = ");
            a = readData();
            System.out.print("b = ");
            b = readData();
            System.out.print("c = ");
            c = readData();

            printEquation(a,b,c);
            equation(a,b,c);
        } else {
            String fileName = args[0];
            
            double[] data = readDataFromFile(fileName);
            a = data[0];
            b = data[1];
            c = data[2];

            printEquation(a,b,c);
            equation(a,b,c);
        }
    }

    public static double[] readDataFromFile(String fileName) throws IOException {
        String[] variables = {};
        double[] returnValues;

        File file = new File(fileName);
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("File " + fileName + " does not exist");
            System.exit(0);
        }

        BufferedReader br = new BufferedReader(fr);
        String line;
        
        while((line = br.readLine()) != null){
            variables = line.split(" ");
        }

        br.close();
        fr.close();

        returnValues = new double[variables.length];

        for(int i = 0; i < variables.length; i++) {
            try {
                returnValues[i] = Double.parseDouble(variables[i]);
            } catch (Exception e) {
                System.out.println("Invalid file format");
                System.exit(0);
            }
        }

        return returnValues;
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
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (D == 0) {
            double x1;
            x1 = (-b) / (2 * a);
            System.out.println("x1 = " + x1);
        }
        else {
            System.out.println("Have no roots");
        }
    }
}