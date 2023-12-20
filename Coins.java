public class Coins {
    public static void main(String[] args) {
        
	int num1 = Integer.parseInt (args[0]);
	int quarters = num1 / 25;
	int cents = num1 % 25;
	System.out.println("Use " + quarters + " quarters " + "and " + cents + " cents");


    }
}