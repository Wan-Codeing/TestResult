package test2;

public class test2 {
	public static void main(String[] args) {
		calculator calculator = new calculator();
		int result = calculator.add(4).add(5).subtract(3).out();
		System.out.println(result);
	}
}
