package test1;

import java.util.ArrayList;

public class Test1 {
	public BreadType createType(String type) {
        BreadType returnType = null;

        switch (type) {
            case "Cream":
                returnType = new Cream();
                break;
            case "Butter":
                returnType = new Butter();
                break;
            case "Sugar":
                returnType = new Sugar();
                break;
        }
        return returnType;
    }
	
	public static void main(String[] args) {
		Test1 Test1 =  new Test1();
		ArrayList<String> ReceipeArray = new ArrayList();
		Cream cream = (Cream)Test1.createType("Cream");
		Butter butter = (Butter)Test1.createType("Butter");
		Sugar sugar = (Sugar)Test1.createType("Sugar");
		
		ReceipeArray.add(cream.RecipeCream());
		ReceipeArray.add(sugar.RecipeSugar());
		ReceipeArray.add(butter.RecipeButter());
		for(String Receipe : ReceipeArray) {
			System.out.println(Receipe);
		}
	}
}



