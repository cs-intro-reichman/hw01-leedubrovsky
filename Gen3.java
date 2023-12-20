public class Gen3 {
    public static void main(String[] args) {
        
	int bottomRange = Integer.parseInt (args[0]);
	int topRange = Integer.parseInt (args[1]);
	
	int num1 = (int)(Math.random()*(topRange-bottomRange))+bottomRange;
	int num2 = (int)(Math.random()*(topRange-bottomRange))+bottomRange;
	int num3 = (int)(Math.random()*(topRange-bottomRange))+bottomRange;
	int min = Math.min(num1, Math.min(num2,num3));

	
	
	System.out.println(num1);
	System.out.println(num2);
	System.out.println(num3);
	System.out.println("The minimal generated number was "+ min);










    }
}