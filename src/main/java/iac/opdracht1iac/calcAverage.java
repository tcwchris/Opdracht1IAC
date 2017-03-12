package iac.opdracht1iac;

import java.text.DecimalFormat;

/**
 * Created by Chris on 12-Mar-17.
 */
public class calcAverage {

    public int number1;
    public int number2;
    public int number3;
    public int number4;
    public double result;

    public calcAverage(int num1, int num2, int num3, int num4){
        number1 = num1;
        number2 = num2;
        number3 = num3;
        number4 = num4;
    }

    public String getAverge(){
        result = (number1 + number2 + number3 + number4) / 4;
        DecimalFormat frmt = new DecimalFormat("#.00");
        return frmt.format(result);
    }



}
