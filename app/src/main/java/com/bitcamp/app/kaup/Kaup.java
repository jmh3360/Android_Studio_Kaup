package com.bitcamp.app.kaup;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by 1027 on 2018-02-05.
 */

public class Kaup {
    public static Double num(EditText num){
        return Double.parseDouble(String.valueOf(num.getText()));
    }
    public static String bmi(TextView name, EditText height, EditText weight){
        String result = "";

        double res = (num(weight)/((num(height)/100)*(num(height)/100)));
        if(res>=35){
            result = String.valueOf(name.getText())+"님은 초고도 비만입니다.";
        }else if(res>=30&&35>res){
            result = String.valueOf(name.getText())+"님은 고도 비만입니다.";
        }else if(res>=25&&30>res) {
            result = String.valueOf(name.getText()) + "님은 비만입니다.";
        }else if(res>=23&&25>res) {
            result = String.valueOf(name.getText()) + "님은 과체중입니다.";
        }else if(res>=18&&23>res) {
            result = String.valueOf(name.getText()) + "님은 정상입니다.";
        }else {
            result = String.valueOf(name.getText()) + "님은 저체중입니다.";
        }


        return "결과 값"+result;
    }
}