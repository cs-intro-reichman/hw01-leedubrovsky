public class LinearEq {
    public static void main(String[] args) {
        
	double a = Double.parseDouble (args[0]);
	double b = Double.parseDouble (args[1]);
	double c = Double.parseDouble (args[2]);
	double X = (c - b) / a;
	
	System.out.println(a + " * "+ "X " + "+ " + b + " = " + c);
	System.out.println("X"+ " = " + X);



    }
}