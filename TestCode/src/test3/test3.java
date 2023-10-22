package test3;

public class test3 {
	public static int factorial(int num) {
        int sum = 1;
        for(int i = num; i>=1; i--) {
            sum *= i; 
        }
        return sum;
    }
    
    public static void main(String[] args) {
    	 int result = factorial(4);
        System.out.println(result);
    }
}
