package cls.model;

public class subtractionModel {
    private String result;
    public void substraction(double num1, double num2,double num3,double num4){
        String t;
        if(num2 - num4 >= 0){
            t = "+";
        }
        else{t = "";}
        result = String.valueOf(num1 - num3) + t + String.valueOf(num2 - num4) + "i";
    }
    public String getResult() {
        return result;
    }
}
