package cls;

public class CalculatorModel {
    private String result;

    public void add(double num1, double num2,double num3,double num4){
        String t;
        if(num2 + num4 >= 0){
            t = "+";
        }
        else{t = "";}
        result = String.valueOf(num1 + num3) + t +String.valueOf(num2 + num4) + "i";
    }
    public void subs(double num1, double num2,double num3,double num4){
        String t;
        if(num2 - num4 >= 0){
            t = "+";
        }
        else{t = "";}
        result = String.valueOf(num1 - num3) + t +String.valueOf(num2 - num4) + "i";
    }
    public void mult(double num1, double num2,double num3,double num4){
        String t;
        if(((num2*num3) + ((num1 * num4))) >= 0){
            t = "+";
        }
        else{t = "";}
        result = String.valueOf(((num1*num3) - (num2*num4)) + t +String.valueOf(((num2*num3) + ((num1 * num4))
                + "i")));
    }
    public void division(double num1, double num2,double num3,double num4){
        while (((num3*num3) + (num4 * num4)) == 0){
            CalculatorView localNumber1 = new CalculatorView();
            CalculatorView localNumber2 = new CalculatorView();
            System.out.println("Cannot divide by zero, please enter another number");
            num3 = localNumber1.getNum();
            num4 = localNumber2.getNum();
        }
        String t;
        if((((num2 * num3) / ((num3 * num3) + (num4 * num4))) - ((num1 * num4) / ((num3 * num3) + (num4 * num4)))) >= 0){
            t = "+";
        }
        else{t = "";}
        result = String.valueOf((((num1*num3)+(num2*num4))/((num3*num3)+(num4*num4))) + t
                +String.valueOf(((num2*num3)-(num1*num4))/((num3*num3)+(num4*num4))) + "i");

    }
//
//    public void pow(double number){result = (Math.pow(result, number));
//    }
//    public void fact(double number){
//        number = 1;
//        for (int i = 1; i <= result; i++) {
//            number *= i;
//        }
//        result = number;
//    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
