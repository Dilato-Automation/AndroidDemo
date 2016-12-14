package com.dilatoit.androiddemo;

import java.math.BigDecimal;

/**
 * Created by Ashhh on 12/12/16.
 */

public class Calc {

    public static String doCalc(String value1,String value2,CalcFunction calcFunc) {
        BigDecimal b1;
        BigDecimal b2;
        BigDecimal result;
        switch (calcFunc) {
            case plus:
                b1 = new BigDecimal(Double.valueOf(value1));
                b2 = new BigDecimal(Double.valueOf(value2));
                result = b1.add(b2);
                break;
            case minus:
                b1 = new BigDecimal(Double.valueOf(value1));
                b2 = new BigDecimal(Double.valueOf(value2));
                result = b1.subtract(b2);
                break;
            case devide:
                if (Double.valueOf(value2) != 0){
                    b1 = new BigDecimal(Double.valueOf(value1));
                    b2 = new BigDecimal(Double.valueOf(value2));
                    result = b1.divide(b2);
                }else {
                    return "ERROR";
                }
                break;
            case mutlyby:
                b1 = new BigDecimal(Double.valueOf(value1));
                b2 = new BigDecimal(Double.valueOf(value2));
                result = b1.multiply(b2);
                break;
            case persent:
                b1 = new BigDecimal(Double.valueOf(value1));
                b2 = new BigDecimal(100);
                result = b1.divide(b2);
                break;
            default:
                result = new BigDecimal(0);
                break;
        }
        String temp = String.valueOf(result.doubleValue());
        if (temp.endsWith(".0")){
            temp = temp.replace(".0","");
        }
        return temp;
    }

    public enum CalcFunction{
        plus,
        minus,
        devide,
        mutlyby,
        persent
    }
}
