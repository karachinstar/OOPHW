package cls.model;

import cls.CalculatorView;

public class divisionModel {
    private String result;

    public void division(double num1, double num2, double num3, double num4) {
        while (((num3 * num3) + (num4 * num4)) == 0) {
            CalculatorView localNumber1 = new CalculatorView();
            CalculatorView localNumber2 = new CalculatorView();
            System.out.println("Cannot divide by zero, please enter another number");
            num3 = localNumber1.getNum1();
            num4 = localNumber2.getNum2();
        }
        String t;
        if ((((num2 * num3) / ((num3 * num3) + (num4 * num4))) - ((num1 * num4) / ((num3 * num3) + (num4 * num4)))) >= 0) {
            t = "+";
        } else {
            t = "";
        }
        result = String.valueOf((((num1 * num3) + (num2 * num4)) / ((num3 * num3) + (num4 * num4))) + t
                + String.valueOf(((num2 * num3) - (num1 * num4)) / ((num3 * num3) + (num4 * num4))) + "i");

    }

    public String getResult() {
        return result;
    }
}
