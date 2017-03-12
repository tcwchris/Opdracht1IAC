package iac.opdracht1iac;

import java.text.DecimalFormat;

/**
 * Created by Chris on 12-Mar-17.
 */
public class calcAverage {

    public double number1;
    public double number2;
    public double number3;
    public double number4;
    public double result;

    public calcAverage(double num1, double num2, double num3, double num4){
        number1 = num1;
        number2 = num2;
        number3 = num3;
        number4 = num4;
    }

    public String getAverge(){
        result = (number1 + number2 + number3 + number4) / 4;
        //DecimalFormat frmt = new DecimalFormat("#.##");
        //return frmt.format(result);
        return(result + "");
    }



}
