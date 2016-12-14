package com.dilatoit.androiddemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity  extends Activity implements View.OnClickListener,View.OnTouchListener {
    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_0;
    private Button button_ac;
    private Button button_c;
    private Button button_plusminus;
    private Button button_plus;
    private Button button_minus;
    private Button button_multiby;
    private Button button_leave;
    private Button button_devide;
    private Button button_equal;
    private Button button_dot;
    private TextView result;
    private String num1;
    private String num2;
    private Calc.CalcFunction function;
    private float lastP;
    private boolean first = true;
    private boolean hasResult = false;
    private boolean pressFunction = false;
    private boolean firstMark = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Test11
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1 = (Button) findViewById(R.id.button1);
        button_2 = (Button) findViewById(R.id.button2);
        button_3 = (Button) findViewById(R.id.button3);
        button_4 = (Button) findViewById(R.id.button4);
        button_5 = (Button) findViewById(R.id.button5);
        button_6 = (Button) findViewById(R.id.button6);
        button_7 = (Button) findViewById(R.id.button7);
        button_8 = (Button) findViewById(R.id.button8);
        button_9 = (Button) findViewById(R.id.button9);
        button_0 = (Button) findViewById(R.id.button0);
        button_ac = (Button) findViewById(R.id.buttonac);
        button_c = (Button) findViewById(R.id.buttonc);
        button_plusminus = (Button) findViewById(R.id.buttonplusminus);
        button_plus = (Button) findViewById(R.id.buttonplus);
        button_minus = (Button) findViewById(R.id.buttonminus);
        button_multiby = (Button) findViewById(R.id.buttonmultiby);
        button_devide = (Button) findViewById(R.id.buttondevide);
        button_leave = (Button) findViewById(R.id.buttonleave);
        button_dot = (Button) findViewById(R.id.buttondot);
        button_equal = (Button) findViewById(R.id.buttonequal);
        result = (TextView) findViewById(R.id.result);
        button_0.setPadding(110,0,0,0);

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_0.setOnClickListener(this);
        button_ac.setOnClickListener(this);
        button_c.setOnClickListener(this);
        button_plusminus.setOnClickListener(this);
        button_plus.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_devide.setOnClickListener(this);
        button_leave.setOnClickListener(this);
        button_dot.setOnClickListener(this);
        button_equal.setOnClickListener(this);
        button_multiby.setOnClickListener(this);
        result.setOnClickListener(this);

        button_1.setOnTouchListener(this);
        button_2.setOnTouchListener(this);
        button_3.setOnTouchListener(this);
        button_4.setOnTouchListener(this);
        button_5.setOnTouchListener(this);
        button_6.setOnTouchListener(this);
        button_7.setOnTouchListener(this);
        button_8.setOnTouchListener(this);
        button_9.setOnTouchListener(this);
        button_0.setOnTouchListener(this);
        button_ac.setOnTouchListener(this);
        button_c.setOnTouchListener(this);
        button_plusminus.setOnTouchListener(this);
        button_plus.setOnTouchListener(this);
        button_minus.setOnTouchListener(this);
        button_devide.setOnTouchListener(this);
        button_leave.setOnTouchListener(this);
        button_dot.setOnTouchListener(this);
        button_equal.setOnTouchListener(this);
        button_multiby.setOnTouchListener(this);
        result.setOnTouchListener(this);

        setText("0");
    }

    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.result:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    float currentP = event.getX();
                    String t = result.getText().toString().replace(",","");
                    if (currentP-lastP>20 && (!t.contains("E") || !t.contains("∞")) && !hasResult && !pressFunction) {
                        if (t.length()==1){
                            setText("0");
                        }else if (t.length() ==2 && t.startsWith("-")) {
                            setText("0");
                        }else {
                            setText(t.substring(0,t.length()-1));
                        }
                    }
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    lastP = event.getX();
                }
                break;
            case R.id.button0:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_0.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_0.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button1:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_1.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_1.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button2:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_2.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_2.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button3:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_3.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_3.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button4:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_4.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_4.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button5:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_5.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_5.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button6:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_6.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_6.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button7:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_7.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_7.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button8:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_8.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_8.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.button9:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_9.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_9.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.buttonac:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_ac.setBackgroundColor(Color.parseColor("#c8c8c8"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_ac.setBackgroundColor(Color.parseColor("#b4b4b4"));
                }
                break;
            case R.id.buttonc:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_c.setBackgroundColor(Color.parseColor("#c8c8c8"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_c.setBackgroundColor(Color.parseColor("#b4b4b4"));
                }
                break;
            case R.id.buttonplusminus:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_plusminus.setBackgroundColor(Color.parseColor("#c8c8c8"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_plusminus.setBackgroundColor(Color.parseColor("#b4b4b4"));
                }
                break;
            case R.id.buttondot:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_dot.setBackgroundColor(Color.parseColor("#e0e0e0"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_dot.setBackgroundColor(Color.parseColor("#cccccc"));
                }
                break;
            case R.id.buttonplus:
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_plus.setBackgroundColor(Color.parseColor("#ff7800"));
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_plus.setBackgroundColor(Color.parseColor("#ff8c00"));
                }
                break;
            case R.id.buttonminus:
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_minus.setBackgroundColor(Color.parseColor("#ff7800"));
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_minus.setBackgroundColor(Color.parseColor("#ff8c00"));
                }
                break;
            case R.id.buttondevide:
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_devide.setBackgroundColor(Color.parseColor("#ff7800"));
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_devide.setBackgroundColor(Color.parseColor("#ff8c00"));
                }
                break;
            case R.id.buttonmultiby:
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_multiby.setBackgroundColor(Color.parseColor("#ff7800"));
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_multiby.setBackgroundColor(Color.parseColor("#ff8c00"));
                }
                break;
            case R.id.buttonleave:
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_leave.setBackgroundColor(Color.parseColor("#c8c8c8"));
                }
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_leave.setBackgroundColor(Color.parseColor("#b4b4b4"));
                }
                break;
            case R.id.buttonequal:
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    button_equal.setBackgroundColor(Color.parseColor("#ff7800"));
                }
                if(event.getAction() == MotionEvent.ACTION_UP){
                    button_equal.setBackgroundColor(Color.parseColor("#ff8c00"));
                }
                break;
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                setNewData("0");
                break;
            case R.id.button1:
                setNewData("1");
                break;
            case R.id.button2:
                setNewData("2");
                break;
            case R.id.button3:
                setNewData("3");
                break;
            case R.id.button4:
                setNewData("4");
                break;
            case R.id.button5:
                setNewData("5");
                break;
            case R.id.button6:
                setNewData("6");
                break;
            case R.id.button7:
                setNewData("7");
                break;
            case R.id.button8:
                setNewData("8");
                break;
            case R.id.button9:
                setNewData("9");
                break;
            case R.id.buttonac:
                num1 = null;
                first = true;
                firstMark = true;
                hasResult = false;
                setText("0");
                setMargins(button_plus,1,1,1,1);
                setMargins(button_minus,1,1,1,1);
                setMargins(button_multiby,1,1,1,1);
                setMargins(button_devide,1,1,1,1);
                break;
            case R.id.buttonc:
                if (num1 == null){
                    num1 = null;
                }else {
                    num2 = null;
                }
                hasResult = false;
                setText("0");
                button_c.setVisibility(View.GONE);
                button_ac.setVisibility(View.VISIBLE);
                break;
            case R.id.buttonplusminus:
                setNewData("+-");
                break;
            case R.id.buttondot:
                setNewData(".");
                break;
            case R.id.buttonplus:
                hasResult = false;
                pressFunction = true;
                function = Calc.CalcFunction.plus;
                setMargins(button_plus,5,5,5,5);
                setMargins(button_minus,1,1,1,1);
                setMargins(button_multiby,1,1,1,1);
                setMargins(button_devide,1,1,1,1);
                if (first) {
                    num1 = result.getText().toString().replaceAll(",","");
                    num2 = null;
                    first = false;
                    firstMark = false;
                }else {
                    calc();
                    first = false;
                    firstMark = false;
                    num2 = null;
                }
                break;
            case R.id.buttonminus:
                hasResult = false;
                pressFunction = true;
                function = Calc.CalcFunction.minus;
                setMargins(button_minus,5,5,5,5);
                setMargins(button_plus,1,1,1,1);
                setMargins(button_multiby,1,1,1,1);
                setMargins(button_devide,1,1,1,1);
                if (first) {
                    num1 = result.getText().toString().replaceAll(",","");
                    num2 = null;
                    first = false;
                    firstMark = false;
                }else {
                    calc();
                    first = false;
                    firstMark = false;
                    num2 = null;
                }
                break;
            case R.id.buttondevide:
                hasResult = false;
                pressFunction = true;
                function = Calc.CalcFunction.devide;
                setMargins(button_devide,5,5,5,5);
                setMargins(button_plus,1,1,1,1);
                setMargins(button_minus,1,1,1,1);
                setMargins(button_multiby,1,1,1,1);
                if (first) {
                    num1 = result.getText().toString().replaceAll(",","");
                    num2 = null;
                    first = false;
                    firstMark = false;
                }else {
                    calc();
                    first = false;
                    firstMark = false;
                    num2 = null;
                }
                break;
            case R.id.buttonmultiby:
                hasResult = false;
                pressFunction = true;
                function = Calc.CalcFunction.mutlyby;
                setMargins(button_multiby,5,5,5,5);
                setMargins(button_plus,1,1,1,1);
                setMargins(button_minus,1,1,1,1);
                setMargins(button_devide,1,1,1,1);
                if (first) {
                    num1 = result.getText().toString().replaceAll(",","");
                    num2 = null;
                    first = false;
                    firstMark = false;
                }else {
                    calc();
                    first = false;
                    firstMark = false;
                    num2 = null;
                }
                break;
            case R.id.buttonleave:
                if (!result.getText().toString().replaceAll(",","").equals("ERROR") && !result.getText().toString().replaceAll(",","").equals("∞"))
                {
                    pressFunction = true;
                    setText(Calc.doCalc(result.getText().toString().replaceAll(",",""),null, Calc.CalcFunction.persent));
                    hasResult = true;
                }
                break;
            case R.id.buttonequal:
                hasResult = false;
                pressFunction = true;
                setMargins(button_plus,1,1,1,1);
                setMargins(button_minus,1,1,1,1);
                setMargins(button_multiby,1,1,1,1);
                setMargins(button_devide,1,1,1,1);
                calc();
                first=true;
                break;
        }
    }

    private void calc() {
        if (num1 != null){
            hasResult = true;
            if (num1.equals("∞")){
                setText("∞");
                return;
            }
            if (num1.equals("ERROR")) {
                setText("ERROR");
                return;
            }
            if (num2 == null){
                num2 = result.getText().toString().replaceAll(",","");
                setText(Calc.doCalc(num1,num2,function));
                num1 = result.getText().toString().replaceAll(",","");
            }else {
                setText(Calc.doCalc(num1,num2,function));
                num1 = result.getText().toString().replaceAll(",","");
            }
        }
    }

    private void setNewData(String value) {
        button_ac.setVisibility(View.GONE);
        button_c.setVisibility(View.VISIBLE);
        if (!firstMark){
            result.setText("0");
            setMargins(button_plus,1,1,1,1);
            setMargins(button_minus,1,1,1,1);
            setMargins(button_multiby,1,1,1,1);
            setMargins(button_devide,1,1,1,1);
            firstMark = true;
        }
        String current = result.getText().toString().replaceAll(",","");
        if (hasResult){
            current = "0";
        }
        if (pressFunction){
            pressFunction = false;
        }
        int maxText = 9;
        if (current.replace("-","").replace(".","").length()<maxText || value == "+-"){
            if (current == "0") {
                if (value == ".") {
                    current = current + ".";
                } else if (value != "+-") {
                    current = value;
                }
            } else {
                if (value == "+-") {
                    if (current.equals("0.")){
                        current = "0";
                    }else {
                        current = current.contains("-") ? current.replace("-", "") : "-" + current;
                    }
                } else if (current.contains(".") && value == ".") {
                    //Do Nothing
                } else{
                    current = current + value;
                }
            }
            setText(current);
        }
    }

    private void setText(String value) {
        String newValue;
        if (value.contains(".")){
            String t1 = value.substring(value.indexOf("."));
            String t2 = value.substring(0,value.indexOf("."));
            DecimalFormat df = new DecimalFormat("#,###");
            t2 = df.format(Double.valueOf(t2));
            newValue = t2+t1;
        }else if (value == "ERROR"){
            newValue = "ERROR";
        }else if (value == "∞"){
            newValue = "∞";
        }else {
            DecimalFormat df = new DecimalFormat("#,###");
            newValue = df.format(Double.valueOf(value));
        }

        if (newValue.contains("E-")){
            if (newValue.length()>=12){
                String t1 = newValue.substring(newValue.indexOf("E-"));
                newValue = newValue.substring(0, 12 - t1.length())+ t1;
            }
        }
        if (newValue.contains("E") && !newValue.equals("ERROR")){
            if (newValue.length()>=12){
                String t1 = newValue.substring(newValue.indexOf("E"));
                newValue = newValue.substring(0, 12 - t1.length())+ t1;
            }
        }


        if (newValue.length()==10 && newValue.contains(".")) {
            result.setTextSize(TypedValue.COMPLEX_UNIT_DIP,60);
        }else if (newValue.length()<=10) {
            result.setTextSize(TypedValue.COMPLEX_UNIT_DIP,70);
        }else if (newValue.length()==11){
            result.setTextSize(TypedValue.COMPLEX_UNIT_DIP,60);
        }else if (newValue.length()==12){
            result.setTextSize(TypedValue.COMPLEX_UNIT_DIP,50);
        }
        result.setText(newValue);
    }

    private static void setMargins (View v, int l, int t, int r, int b) {
        if (v.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            p.setMargins(l, t, r, b);
            v.requestLayout();
        }
    }
}
